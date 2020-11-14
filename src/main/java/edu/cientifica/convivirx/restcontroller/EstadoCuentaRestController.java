package edu.cientifica.convivirx.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import edu.cientifica.convivirx.model.EstadoCuentaRest;
import edu.cientifica.convivirx.services.EstadoCuentaRestService;


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

}
