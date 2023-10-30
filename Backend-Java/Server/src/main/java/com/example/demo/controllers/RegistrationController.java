package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.User;
import com.example.demo.models.UserRegistrationRequest;
import com.example.demo.service.RegistrationService;

@RestController
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/register")
    public String register(@RequestBody UserRegistrationRequest registrationRequest) {
        User registeredUser = registrationService.register(registrationRequest);

        if (registeredUser != null) {
            // You can return a success message or a user ID here, for example:
            return "User registered successfully";
        } else {
            // Handle the case where registration fails
            return "User registration failed. Please check the provided information.";
        }
    }
}
