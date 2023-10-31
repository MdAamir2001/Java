package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/home")
	public String displayHome() {
		return "Homepage";
	}
	@GetMapping("/result")
	public String result() {
		return "result";
	}
	
	
	
	
}
