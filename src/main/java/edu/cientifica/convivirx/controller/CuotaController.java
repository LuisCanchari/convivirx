package edu.cientifica.convivirx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.cientifica.convivirx.services.CuotaService;

@Controller
@RequestMapping("/cuota")
public class CuotaController {
	
	@Autowired
	private CuotaService cuotaService;
	
	@RequestMapping("/lista")
	public String cuotaLista(Model model) {
		model.addAttribute("cuotas", cuotaService.listaCuota());
		return "cuota_list";
	}
	
	@RequestMapping("/detalle/{id}")
	public String cuotaDetalle(@PathVariable (name = "id") int id) {
		
		return "cuota_list";
	}

}
