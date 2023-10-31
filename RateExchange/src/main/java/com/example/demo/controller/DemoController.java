package com.example.demo.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.CurrencyConverter;

@Controller
public class DemoController {

    @GetMapping("/converter")
    public String showConverterForm(Model model) {
        model.addAttribute("converter", new CurrencyConverter());
        return "converterForm";
    }

    @PostMapping("/convert")
    public String convertCurrency(CurrencyConverter converter, Model model) {
        // Perform currency conversion logic here
        // You can access converter.getAmount(), converter.getFromCurrency(), and converter.getToCurrency()

        // For example:
        double convertedAmount = 0.0; // Perform conversion here
        model.addAttribute("convertedAmount", convertedAmount);

        return "result";
    }
}
