package edu.cientifica.convivirx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import edu.cientifica.convivirx.services.EstadoCuentaUPrivadaService;

@Controller
@RequestMapping("/estadocuenta")
public class EstadoCuentaController {
	
	@Autowired
	private EstadoCuentaUPrivadaService estadoCuentaUprivadaService;
	
	@RequestMapping("/uprivada/lista")
	public String listaEstadoCuentaCuentaUprivada(Model model) {

		model.addAttribute("lista_estadocuenta", estadoCuentaUprivadaService.listaEstadoCuentaUPrivadaAll());
		
		return "estadocuenta_uprivada_list";
	}
	
	
	
	

}
