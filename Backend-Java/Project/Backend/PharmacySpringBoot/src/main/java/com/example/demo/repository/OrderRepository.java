package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.OrderManagement;

@Repository
public interface OrderRepository extends JpaRepository<OrderManagement, Long> {
    
}