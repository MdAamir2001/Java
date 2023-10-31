package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

    @GetMapping("/adminLogin")
    public String showAdminLoginForm() {
        return "adminLogin";
    }

    @PostMapping("/adminDashboard")
    public String processAdminLogin(@RequestParam String username, @RequestParam String password) {
	System.out.print(username);
	System.out.print(password);
        if (username.equals("admin") && password.equals("password")) {
            return "adminDashboard"; // Redirect to admin dashboard page
        } else {
            return "login"; // Redirect back to login page on failure
        }
    }
}
