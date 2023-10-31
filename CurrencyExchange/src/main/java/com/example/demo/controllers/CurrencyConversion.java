package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class CurrencyConversion {
	
    @PostMapping("/result")
    public String convertCurrency(
        @RequestParam("amount") double amount,
        @RequestParam("sourceCurrency") String sourceCurrency,
        @RequestParam("targetCurrency") String targetCurrency,
        Model model) {

        double convertedAmount = performConversion(amount, sourceCurrency, targetCurrency);

        model.addAttribute("amount", amount);
        model.addAttribute("sourceCurrency", sourceCurrency);
        model.addAttribute("targetCurrency", targetCurrency);
        model.addAttribute("convertedAmount", convertedAmount);

        return "result"; 
    }

    private double performConversion(double amount, String sourceCurrency, String targetCurrency) {

        double conversionRate = 1.2; 
        if (sourceCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            return amount * conversionRate;
        } else if (sourceCurrency.equals("EUR") && targetCurrency.equals("USD")) {
            return amount / conversionRate;
        } else {
            return amount;         }
    }
}
