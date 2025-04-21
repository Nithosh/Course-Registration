package com.example.courseregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.courseregistration.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
