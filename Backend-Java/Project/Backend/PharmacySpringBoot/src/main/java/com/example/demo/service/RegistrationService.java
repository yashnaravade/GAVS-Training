package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.User;
import com.example.demo.entities.UserRegistrationRequest;
import com.example.demo.repository.UserRepository;

@Service
public class RegistrationService {

    @Autowired
    private UserRepository userRepository;

    public User register(UserRegistrationRequest registrationRequest) {
        User newUser = new User();
        newUser.setUsername(registrationRequest.getUsername());
        newUser.setPassword(registrationRequest.getPassword());
        newUser.setEmail(registrationRequest.getEmail());

        // Save the user to the database
        userRepository.save(newUser);

        return newUser;
    }
}