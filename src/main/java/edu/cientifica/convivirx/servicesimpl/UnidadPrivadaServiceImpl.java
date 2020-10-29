package edu.cientifica.convivirx.servicesimpl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cientifica.convivirx.mappers.UnidadPrivadaMapper;
import edu.cientifica.convivirx.model.UnidadPrivada;
import edu.cientifica.convivirx.services.UnidadPrivadaService;

@Service
public class UnidadPrivadaServiceImpl implements UnidadPrivadaService{
	protected final Log LOG = LogFactory.getLog(this.getClass());
	
	@Autowired //Inyecccion de dependencia
	UnidadPrivadaMapper unidadPrivadaMapper;
	
	
	@Override
	public int registrarUnidadPrivada(UnidadPrivada unidadPrivada) {
		int result;
		result=unidadPrivadaMapper.addUnidadPrivada(unidadPrivada);
		LOG.info("Numero de registroa afectados : "+result);
		return result;
	}

	@Override
	public List<UnidadPrivada> listarUnidadPrivada(){
		
		LOG.info("Unidades: " +unidadPrivadaMapper.findAllUnidadPrivada());
		return unidadPrivadaMapper.findAllUnidadPrivada();
		
	}

}
