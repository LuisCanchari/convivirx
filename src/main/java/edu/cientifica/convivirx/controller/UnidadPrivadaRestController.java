package edu.cientifica.convivirx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.cientifica.convivirx.model.UnidadPrivada;
import edu.cientifica.convivirx.services.UnidadPrivadaService;

@RestController
@RequestMapping("/uprivada")
public class UnidadPrivadaRestController {
	
	@Autowired UnidadPrivadaService unidadPrivadaService;
	
		

	@GetMapping(value = "/restlista")
	public List<UnidadPrivada> listaUnidadPrivada(){
		List<UnidadPrivada> lista;
		
		lista = unidadPrivadaService.listarUnidadPrivada();
		
		return lista ;
		
	}
	
	

}
