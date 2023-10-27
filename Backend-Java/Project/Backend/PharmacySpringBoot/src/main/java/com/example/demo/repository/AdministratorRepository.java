package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Administrator;

public interface AdministratorRepository extends JpaRepository<Administrator, Long> {
   
}

