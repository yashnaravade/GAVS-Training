package com.currencyexchange.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import currencyexchange.model.ConversionRate;
import currencyexchange.repository.ConversionRateRepository;

@Service
public class CurrencyConversionService {

    @Autowired
    private ConversionRateRepository conversionRateRepository;

    public double convertCurrency(String fromCurrencyCode, String toCurrencyCode, double amount) {
        ConversionRate rate = conversionRateRepository.findConversionRate(fromCurrencyCode, toCurrencyCode);
        if (rate != null) {
            return amount * rate.getRate();
        }
        // Handle the case when no conversion rate is found.
        return -1; // You can use a different value or exception for error handling.
    }
}
