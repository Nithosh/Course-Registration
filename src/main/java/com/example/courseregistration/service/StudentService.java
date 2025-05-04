package com.example.courseregistration.service;

import com.example.courseregistration.exception.ResourceNotFoundException;
import com.example.courseregistration.model.Student;
import com.example.courseregistration.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepo;

    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepo.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Student not found with ID: " + id));
    }

    public void deleteStudent(Long id) {
        Student student = getStudentById(id);
        studentRepo.delete(student);
    }
}
