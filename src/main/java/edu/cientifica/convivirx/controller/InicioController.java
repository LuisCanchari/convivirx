package edu.cientifica.convivirx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InicioController {

	@RequestMapping({"/","/index"})
	public String inicio() {
		return "index";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/principal")
	public String pricipal() {
		return "principal";
	}
	
	

}
