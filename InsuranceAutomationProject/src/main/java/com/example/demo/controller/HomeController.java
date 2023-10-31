package com.example.demo.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 
@Controller
public class HomeController {
	@GetMapping("/home")
	public String displayHome() {
		return "home";
	}
	@GetMapping("/insurance")
	public String Home() {
		return "insurance";
	}
	@GetMapping("/customer")
	public String displayCustomerPage() {
		return "CustomerView";
	}
	@GetMapping("/lifecare")
	public String displayLifeCare() {
		return "lifecare";
	}
	@GetMapping("/homecare")
	public String displayLHomeCare() {
		return "homecare";
	}
	@GetMapping("/childcare")
	public String displayChildCare() {
		return "Childcare";
	}
	@GetMapping("/healthcare")
	public String displayHealthCare() {
		return "healthcare";
	}
	@GetMapping("/vehiclecare")
	public String displayVehicle() {
		return "vehiclecare";
	}
 
 
}