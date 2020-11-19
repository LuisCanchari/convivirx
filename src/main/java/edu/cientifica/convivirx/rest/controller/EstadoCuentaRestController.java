package edu.cientifica.convivirx.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.fasterxml.jackson.databind.ObjectMapper;

import edu.cientifica.convivirx.rest.model.EstadoCuentaCuota;
import edu.cientifica.convivirx.rest.model.EstadoCuentaRest;
import edu.cientifica.convivirx.rest.model.EstadoCuentaUPrivada;
import edu.cientifica.convivirx.services.EstadoCuentaCuotaService;
import edu.cientifica.convivirx.services.EstadoCuentaRestService;
import edu.cientifica.convivirx.services.EstadoCuentaUPrivadaService;


@RestController
@RequestMapping("/rest/estadocuenta")
public class EstadoCuentaRestController {
	
	@Autowired
	private EstadoCuentaRestService estadoCuentaRestService;
	
	@RequestMapping("/all")
	public List<EstadoCuentaRest> getListaEstadoCuentaRest() {
		return estadoCuentaRestService.listaEstadoCuentaRest();
		
	}
	
	@RequestMapping("/uprivada/{id}")
	public EstadoCuentaRest getListaEstadoCuentaForUnidadPrivada(@PathVariable("id") int id) {
		return estadoCuentaRestService.estadoCuentaRestPorUnidadPrivada(id);
				
	}
	
	@RequestMapping("/demo")
	public List<EstadoCuentaRest> demo(){
		return estadoCuentaRestService.listaEstadoCuentaRest();
	}
	
	@Autowired
	private EstadoCuentaUPrivadaService estadoCuentaUPrivadaService;

	@RequestMapping("/uprivada/all")
	public List<EstadoCuentaUPrivada> getEstadoCuentaUPrivadaAll() {
		 //JSONArray userArray = new JSONArray();
		//JSon
		//JsonNode
		ObjectMapper objectMapper =  new ObjectMapper();
		//objectMapper.writeValueAsString(value)
		
		return estadoCuentaUPrivadaService.listaEstadoCuentaUPrivadaAll();
	}
	
	@Autowired
	private EstadoCuentaCuotaService estadoCuentaCuotaService;
	
	@RequestMapping("/cuota/all")
	public List<EstadoCuentaCuota> getEstadoCuentaCuotaAll() {
		List<EstadoCuentaCuota> lisEstadoCuentaCuotas;
		lisEstadoCuentaCuotas = 
				estadoCuentaCuotaService.listaEstadoCuentaCuotaAll();
		
		for (EstadoCuentaCuota estadoCuentaCuota : lisEstadoCuentaCuotas) {
			
			
		}
		return lisEstadoCuentaCuotas;
	}
	
//	@RequestMapping("/cuota/all")
//	public List<EstadoCuentaCuota> getEstadoCuentaCuotaAll() {
//		return estadoCuentaCuotaService.listaEstadoCuentaCuotaAll();
//	}
	

	

}
