package edu.cientifica.convivirx.rest.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import edu.cientifica.convivirx.model.Abono;
import edu.cientifica.convivirx.services.AbonoService;

@RestController
@RequestMapping("/rest/abono") 
public class AbonoRestController {
	protected final Log LOG =  LogFactory.getLog(this.getClass());
	@Autowired
	AbonoService abonoService;
	
	@PostMapping
	public ResponseEntity<Abono> registrarAbono(@RequestBody Abono abono) {
		Abono nuevoResgistro;
		LOG.info("Abono recibido"+abono.toString());
		nuevoResgistro =  abonoService.registrarAbono(abono);
		
	    HttpHeaders httpHeaders = new HttpHeaders();
	    
	    httpHeaders.setLocation(
	            ServletUriComponentsBuilder
	                    .fromCurrentRequest()
	                    .path("/{id}")
	                    .buildAndExpand(nuevoResgistro.getId())
	                    .toUri());
	    
	    return new ResponseEntity<>(httpHeaders, HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public ResponseEntity<Abono> getListaAbono(@PathVariable (name = "id") int id) {
		Abono data;
		data = abonoService.obtenerAbonoById(id);
		return new ResponseEntity<>(data, HttpStatus.OK);
		
	}
	

}
