package com.example.demo.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.CurrencyExchangeRate;
import com.example.demo.service.CurrencyExchangeService;

@RestController
@RequestMapping("/exchange-rates")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CurrencyExchangeController {
    @Autowired
    private CurrencyExchangeService exchangeService;

    @PostMapping("/add")
    public CurrencyExchangeRate addExchangeRate(@RequestBody CurrencyExchangeRate rate) {
        return exchangeService.saveExchangeRate(rate);
    }

    @GetMapping("/all")
    public List<CurrencyExchangeRate> getAllExchangeRates() {
        return exchangeService.getAllExchangeRates();
    }

    @GetMapping("/{id}")
    public CurrencyExchangeRate getExchangeRateById(@PathVariable Long id) {
        return exchangeService.getExchangeRateById(id);
    }

}
