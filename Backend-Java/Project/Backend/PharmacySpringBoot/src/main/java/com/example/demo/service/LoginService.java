package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repository.LoginRepository;
@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public User check(String username) {
        return loginRepository.findByUsername(username);
    }

    // Method to check the role of a user (admin or staff)
    public String getUserRole(String username) {
        User user = loginRepository.findByUsername(username);

        if (user != null) {
            String role = user.getRole();
            if (role != null) {
                // Assuming roles are stored as strings like "admin" or "staff"
                if (role.equalsIgnoreCase("admin")) {
                    return "admin";
                } else if (role.equalsIgnoreCase("staff")) {
                    return "staff";
                }
            }
        }

        // Return a default role (e.g., "user" or "unknown") if no role is found
        return "unknown";
    }
}
