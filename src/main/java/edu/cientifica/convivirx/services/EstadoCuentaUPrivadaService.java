package edu.cientifica.convivirx.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cientifica.convivirx.rest.model.EstadoCuentaUPrivada;


@Service
public interface EstadoCuentaUPrivadaService {
	
	public List<EstadoCuentaUPrivada> listaEstadoCuentaUPrivadaAll();
	

}
