package com.example.courseregistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.courseregistration.model.Course;
import com.example.courseregistration.repository.CourseRepository;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }
}
