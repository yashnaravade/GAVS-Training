package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Currency;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
