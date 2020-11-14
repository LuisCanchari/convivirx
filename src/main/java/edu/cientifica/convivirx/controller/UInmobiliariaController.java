package edu.cientifica.convivirx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.sym.Name;

@Controller
@RestController
@RequestMapping("/uinmobiliaria")
public class UInmobiliariaController {
	
	@GetMapping("/lista")
	public String listaUnidadInmobiliaria() {
		return "";
	}
}
