package edu.cientifica.convivirx.services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.cientifica.convivirx.model.EstadoCuenta;
import edu.cientifica.convivirx.model.UnidadPrivada;

@Service
public interface EstadoCuentaService {
	
	public EstadoCuenta selectEstadoCuentaForUnidadPrivada(int id);
	public List<EstadoCuenta> selectEstadoCuenta();

}
