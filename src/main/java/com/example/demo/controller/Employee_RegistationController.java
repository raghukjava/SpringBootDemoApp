package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("welcome")
public class Employee_RegistationController {
	@GetMapping("/cyr")
	public String getEmpList() {
		return "This is Student marks";
	}
	

}
