package com.example.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.User;
import com.example.demo.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	private LoginRepository loginRepository; // Use a consistent naming convention (loginRepository instead of loginrepository)

	public User check(String username) {
		return loginRepository.findByUsername(username);
	}
}
