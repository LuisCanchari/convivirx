package edu.cientifica.convivirx.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cientifica.convivirx.mappers.EstadoCuentaMapper;
import edu.cientifica.convivirx.model.UnidadPrivada;
import edu.cientifica.convivirx.rest.model.EstadoCuenta;
import edu.cientifica.convivirx.rest.model.EstadoCuentaRest;
import edu.cientifica.convivirx.services.EstadoCuentaService;

@Service
public class EstadoCuentaServiceImpl implements EstadoCuentaService{
	
	@Autowired
	private EstadoCuentaMapper estadoCuentaMapper;

	@Override
	public EstadoCuenta estadoCuentabyId(int id) {
		// TODO Auto-generated method stub
		return estadoCuentaMapper.selectEstadoCuentaForUnidadPrivada(id);
	}

	@Override
	public List<EstadoCuenta> listaEstadoCuenta() {
		// TODO Auto-generated method stub
		return estadoCuentaMapper.selectEstadoCuenta();
	}

	@Override
	public List<EstadoCuentaRest> listaEstadoCuentaCuota() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
