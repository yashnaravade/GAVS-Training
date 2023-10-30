package com.example.demo.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.User;

@Repository
public interface LoginRepository extends CrudRepository<User, Long>  {
	
	User findByUsername(String username);
	

}

