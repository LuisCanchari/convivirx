package edu.cientifica.convivirx.rest.controller;

import java.util.List;

import javax.security.auth.kerberos.ServicePermission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.cientifica.convivirx.model.Persona;
import edu.cientifica.convivirx.services.PersonaService;

@RestController
@RequestMapping("/rest/persona")
public class PersonaRestController {
	
	@Autowired
	private PersonaService personaService;
	
	@RequestMapping("/all")
	public List<Persona> getListaPersonaRest() {
		return personaService.listaPersona();
	}
}
