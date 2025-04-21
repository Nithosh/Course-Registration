package com.example.courseregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.courseregistration.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
