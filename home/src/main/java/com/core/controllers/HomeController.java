package com.core.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("")
	public String home(Model model) {
		model.addAttribute("titulo", "Spring Boot");
		model.addAttribute("content", "Spring Boot Content Page");
		return "index";
	}
}
