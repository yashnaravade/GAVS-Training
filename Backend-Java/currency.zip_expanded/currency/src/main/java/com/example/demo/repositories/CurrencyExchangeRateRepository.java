package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.CurrencyExchangeRate;

public interface CurrencyExchangeRateRepository extends JpaRepository<CurrencyExchangeRate, Long> {

}


