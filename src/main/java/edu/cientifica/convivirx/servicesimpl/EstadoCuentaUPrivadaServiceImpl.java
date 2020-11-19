package edu.cientifica.convivirx.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cientifica.convivirx.mappers.EstadoCuentaUPrivadaMapper;
import edu.cientifica.convivirx.rest.model.EstadoCuentaUPrivada;
import edu.cientifica.convivirx.services.EstadoCuentaUPrivadaService;

@Service
public class EstadoCuentaUPrivadaServiceImpl implements EstadoCuentaUPrivadaService{
	
	@Autowired
	private EstadoCuentaUPrivadaMapper estadoCuentaUPrivadaMapper;

	@Override
	public List<EstadoCuentaUPrivada> listaEstadoCuentaUPrivadaAll() {
	
		return estadoCuentaUPrivadaMapper.selectEstadoCuentaUPrivadaAll();
	}
	

}
