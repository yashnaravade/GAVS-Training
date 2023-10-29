package com.currencyexchangey.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import currencyexchange.service.CurrencyConversionService;

@Controller
public class CurrencyExchangeController {

    @Autowired
    private CurrencyConversionService currencyConversionService;

    @GetMapping("/")
    public String showExchangeForm(Model model) {
        // Populate model with currency data if needed
        return "exchange-form"; // Return the name of the JSP view
    }

    @PostMapping("/convert")
    public String convertCurrency(@RequestParam String fromCurrency, @RequestParam String toCurrency, @RequestParam double amount, Model model) {
        double result = currencyConversionService.convertCurrency(fromCurrency, toCurrency, amount);
        model.addAttribute("result", result);
        return "result"; // Return the name of the JSP view for displaying the result
    }
}
