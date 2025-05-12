package com.example.courseregistration.controller;

import java.util.List;

import com.example.courseregistration.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.courseregistration.model.Student;
import com.example.courseregistration.service.StudentService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private EmailService emailService;

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }

    @PostMapping("/students")
    public ResponseEntity<Student> register(@RequestBody Student student) {
        Student savedStudent = studentService.saveStudent(student);

        // Send confirmation email
        String subject = "Course Registration Successful";
        String body = String.format(
                "Hello %s,\n\nYou have successfully registered for the course:\n\n" +
                "Name: %s\nRegistration Number: %s\nEmail: %s\nCourse: %s\n\nThank you!",
                student.getName(),
                student.getName(),
                student.getRegistrationNumber(),
                student.getEmail(),
                student.getCourse()
        );

        emailService.sendSimpleMessage(student.getEmail(), subject, body);

        return ResponseEntity.ok(savedStudent);
    }
}
