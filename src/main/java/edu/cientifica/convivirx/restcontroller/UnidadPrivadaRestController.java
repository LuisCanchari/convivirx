package edu.cientifica.convivirx.restcontroller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.cientifica.convivirx.model.UnidadPrivada;
import edu.cientifica.convivirx.services.UnidadPrivadaService;

@RestController
@RequestMapping("/rest/uprivada")
public class UnidadPrivadaRestController {
	protected final Log LOG =  LogFactory.getLog(this.getClass());
	
	@Autowired UnidadPrivadaService unidadPrivadaService;
	
		

	@GetMapping(value = "/all")
	public List<UnidadPrivada> getAll(){
		List<UnidadPrivada> lista;
		lista = unidadPrivadaService.listarUnidadPrivada();
		return lista;
	}
	
	@GetMapping(value = "/{id}")
	public UnidadPrivada getUnidadPrivada(@PathVariable("id") int id){
		UnidadPrivada  unidadPrivada;
		unidadPrivada= unidadPrivadaService.unidadPrivadaById(id);
		
		return unidadPrivada;
	}
	
	
	@GetMapping(value = "/condominio/{inmobiliariaId}")
	public UnidadPrivada getByUnidadInmobiliaria(@PathVariable(name = "inmobiliariaId") int id){
		UnidadPrivada  unidadPrivada;
		unidadPrivada= unidadPrivadaService.unidadPrivadaById(id);
		return unidadPrivada ;
	}
	
	@PostMapping(value = "/save")
	public UnidadPrivada save(@RequestBody UnidadPrivada unidadPrivada) {
		
		return unidadPrivadaService.save(unidadPrivada);
		
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public boolean delete(@PathVariable("id") int unidadPrivadaId) {
		return unidadPrivadaService.delete(unidadPrivadaId);
	}
	
	@PutMapping(value="/update/{id}")
	public int update(@PathVariable("id") int unidadPrivadaId, @RequestBody UnidadPrivada unidadPrivada) {
		UnidadPrivada uPrivada;
		uPrivada = unidadPrivadaService.unidadPrivadaById(unidadPrivadaId);
		unidadPrivada.setId(unidadPrivadaId);
		
		return unidadPrivadaService.actualizarUnidadPrivada(unidadPrivada);
		
	}
	
}
