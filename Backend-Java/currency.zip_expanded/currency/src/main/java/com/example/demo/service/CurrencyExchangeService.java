package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.CurrencyExchangeRate;
import com.example.demo.repositories.CurrencyExchangeRateRepository;

@Service
public class CurrencyExchangeService {
    @Autowired
    private CurrencyExchangeRateRepository rateRepository;

    public CurrencyExchangeRate saveExchangeRate(CurrencyExchangeRate rate) {
        return rateRepository.save(rate);
    }

    public List<CurrencyExchangeRate> getAllExchangeRates() {
        return rateRepository.findAll();
    }

    public CurrencyExchangeRate getExchangeRateById(Long id) {
        return rateRepository.findById(id).orElse(null);
    }

  
}
