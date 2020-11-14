package edu.cientifica.convivirx.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cientifica.convivirx.mappers.PersonaMapper;
import edu.cientifica.convivirx.model.Persona;
import edu.cientifica.convivirx.services.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {
	@Autowired
	private PersonaMapper personaMapper;

	@Override
	public List<Persona> listaPersona() {
		return personaMapper.selectListaPersona();
	}

}
