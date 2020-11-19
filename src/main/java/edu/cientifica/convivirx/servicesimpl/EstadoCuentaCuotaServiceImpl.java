package edu.cientifica.convivirx.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cientifica.convivirx.mappers.EstadoCuentaCuotaMapper;
import edu.cientifica.convivirx.rest.model.EstadoCuentaCuota;
import edu.cientifica.convivirx.services.EstadoCuentaCuotaService;


@Service
public class EstadoCuentaCuotaServiceImpl implements EstadoCuentaCuotaService{
	@Autowired
	private EstadoCuentaCuotaMapper estadoCuentaCuotaMapper;

	@Override
	public List<EstadoCuentaCuota> listaEstadoCuentaCuotaAll() {
		return estadoCuentaCuotaMapper.selectEstadoCuentaCuotaAll();
	}
	

	
	

	
	

}
