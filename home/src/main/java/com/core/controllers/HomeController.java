package com.core.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.core.services.domain.Usuario;

@Controller
public class HomeController {
	
	@GetMapping({"", "/"})
	public String home(Model model) {
		Usuario user = new Usuario("Carlos Manuel", 
				"Aparicio Vivero", 
				"apariciovivero@gmail.com", 
				"0923993281", 
				"Urdesa Central", "caparicio");
		
		model.addAttribute("usuario", user);
		model.addAttribute("titulo", "Spring Boot");
		model.addAttribute("content", "Spring Boot Content Page");
		return "home";
	}
}
