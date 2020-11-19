package edu.cientifica.convivirx.services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.cientifica.convivirx.rest.model.EstadoCuentaCuota;
import edu.cientifica.convivirx.rest.model.EstadoCuentaUPrivada;

@Service
public interface EstadoCuentaCuotaService {
	
	public List<EstadoCuentaCuota> listaEstadoCuentaCuotaAll();

}
