package com.example.courseregistration.dto;

import java.util.List;

public class StudentDTO {
    private Long studentId;
    private String name;
    private String email;
    private List<Long> courseIds;
    public Long getStudentId() {
        return studentId;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public List<Long> getCourseIds() {
        return courseIds;
    }
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setCourseIds(List<Long> courseIds) {
        this.courseIds = courseIds;
    }
    
    
   }
