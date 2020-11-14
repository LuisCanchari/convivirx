package edu.cientifica.convivirx.services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.cientifica.convivirx.model.EstadoCuentaRest;

@Service
public interface EstadoCuentaRestService {
	public List<EstadoCuentaRest> listaEstadoCuentaRest();
	public EstadoCuentaRest estadoCuentaRestPorUnidadPrivada(int id);

}
