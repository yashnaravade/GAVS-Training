package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Currency;
import com.example.demo.model.ExchangeRate;
import com.example.demo.repositories.CurrencyRepository;
import com.example.demo.repositories.ExchangeRateRepository;

import java.util.List;

@Service
public class CurrencyService {
    @Autowired
    private CurrencyRepository currencyRepository;
    @Autowired
    private ExchangeRateRepository exchangeRateRepository;

    public List<Currency> getAllCurrencies() {
        return currencyRepository.findAll();
    }

    public double convertCurrency(Long fromCurrencyId, Long toCurrencyId, double amount) {
        
        Currency fromCurrency = currencyRepository.findById(fromCurrencyId).orElse(null);
        Currency toCurrency = currencyRepository.findById(toCurrencyId).orElse(null);

        if (fromCurrency != null && toCurrency != null) {
            ExchangeRate exchangeRate = exchangeRateRepository
                    .findByFromCurrencyAndToCurrency(fromCurrency, toCurrency);

            if (exchangeRate != null) {
                return amount * exchangeRate.getRate();
            }
        }
        return 0.0;
    }
}
