package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.CurrencyService;
import com.example.demo.service.UserService;

@Controller
public class CurrencyController {
    @Autowired
    private UserService userService;
    @Autowired
    private CurrencyService currencyService;

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        // Simulate a simple login check
        if ("admin".equals(username) && "admin".equals(password)) {
            return "redirect:/currency-conversion";
        } else {
            return "login";
        }
    }

    @GetMapping("/currency-conversion")
    public String showCurrencyConversionPage(Model model) {
        model.addAttribute("currencies", currencyService.getAllCurrencies());
        return "currency-conversion";
    }

    @PostMapping("/convert-currency")
    public String convertCurrency(
            @RequestParam Long fromCurrencyId,
            @RequestParam Long toCurrencyId,
            @RequestParam double amount,
            Model model) {
        double result = currencyService.convertCurrency(fromCurrencyId, toCurrencyId, amount);
        model.addAttribute("result", result);
        return "currency-conversion";
    }
}
