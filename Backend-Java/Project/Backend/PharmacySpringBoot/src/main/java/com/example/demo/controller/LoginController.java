package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.User;
import com.example.demo.service.LoginService;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/login")
    public String login(@RequestBody User user) {
        // Retrieve user from the database based on the provided username
        User existingUser = loginService.check(user.getUsername());

        // Check if the user exists and if the provided password matches the stored password
        if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
            return "Success";
        } else {
            return "Login failed. Please check your credentials.";
        }
    }
}
