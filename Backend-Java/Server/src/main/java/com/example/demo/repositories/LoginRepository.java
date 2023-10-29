package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.User;

@Repository
public interface LoginRepository extends CrudRepository<User, Long>  {
	
	User findByUsername(String username);
	

}
