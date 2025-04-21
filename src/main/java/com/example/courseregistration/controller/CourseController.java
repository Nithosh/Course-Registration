package com.example.courseregistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.courseregistration.model.Course;
import com.example.courseregistration.service.CourseService;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin(origins = "*") 
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> getCourses() {
        return courseService.getAllCourses();
    }

  
    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return courseService.saveCourse(course);
    }
}
