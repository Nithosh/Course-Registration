package com.example.courseregistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.courseregistration.model.Student;
import com.example.courseregistration.service.StudentService;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*") 
public class StudentController {

    @Autowired
    private StudentService studentService;

    
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

   
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }


    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
}
