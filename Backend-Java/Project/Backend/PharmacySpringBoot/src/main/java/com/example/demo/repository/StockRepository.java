package com.example.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Stock;


public interface StockRepository extends JpaRepository<Stock, Long> {

	List<Stock> findByExpirationDateBefore(Date currentDate);
    
}
