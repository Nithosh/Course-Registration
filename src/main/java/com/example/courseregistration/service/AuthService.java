package com.example.courseregistration.service;

import com.example.courseregistration.model.Admin;
import com.example.courseregistration.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private AdminRepository adminRepository;

    public boolean isEmailRegistered(String email) {
        return adminRepository.findByEmail(email) != null;
    }

    public void register(String name, String email, String password) {
        Admin admin = new Admin();
        admin.setName(name);
        admin.setEmail(email);
        admin.setPassword(password);
        adminRepository.save(admin);
    }

    public boolean login(String email, String password) {
        Admin admin = adminRepository.findByEmail(email);
        return admin != null && admin.getPassword().equals(password);
    }
}
