package edu.cientifica.convivirx.services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.cientifica.convivirx.model.Persona;

@Service
public interface PersonaService {

	public List<Persona> listaPersona();

}
