package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.entities.UserRegistrationRequest;
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
            
            return "User registered successfully";
        } else {
            
            return "User registration failed. Please check the provided information.";
        }
    }
}
