package edu.cientifica.convivirx.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cientifica.convivirx.mappers.UnidadInmobiliariaMapper;
import edu.cientifica.convivirx.model.UnidadInmobiliaria;
import edu.cientifica.convivirx.services.UnidadInmobiliariaService;

@Service
public class UnidadInmobiliariaServiceImpl implements UnidadInmobiliariaService{
	
	@Autowired UnidadInmobiliariaMapper unidadInmobiliariaMapper;
	

	@Override
	public List<UnidadInmobiliaria> listarUnidadInmobiliaria()  {
		
		return unidadInmobiliariaMapper.findAllUnidadInmobiliaria();
	}
	
	

}
