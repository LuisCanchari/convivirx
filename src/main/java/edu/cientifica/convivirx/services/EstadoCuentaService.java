package edu.cientifica.convivirx.services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.cientifica.convivirx.model.UnidadPrivada;
import edu.cientifica.convivirx.rest.model.EstadoCuenta;
import edu.cientifica.convivirx.rest.model.EstadoCuentaRest;

@Service
public interface EstadoCuentaService {
	
	public EstadoCuenta estadoCuentabyId(int id);
	public List<EstadoCuenta> listaEstadoCuenta();
	public List<EstadoCuentaRest> listaEstadoCuentaCuota();

}
