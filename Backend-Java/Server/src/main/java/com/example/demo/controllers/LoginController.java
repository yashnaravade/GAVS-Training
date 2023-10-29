package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.User; // Import the correct User class
import com.example.demo.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginService; // Use a consistent naming convention (loginService instead of loginservice)

	@PostMapping("/login")
	public String login(@RequestBody User username) {
		User user = loginService.check(username.getUsername());
		System.out.println(username);
		if (user != null) {
			// You can return a success message or a user ID here, for example:
			return "Login successful for user: " + user.getUsername();
		} else {
			// Handle the case where the user is not found or login fails
			return "Login failed. Please check your credentials.";
		}
	}
}
