package edu.cientifica.convivirx.servicesimpl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cientifica.convivirx.mappers.EstadoCuentaRestMapper;
import edu.cientifica.convivirx.rest.model.EstadoCuentaRest;
import edu.cientifica.convivirx.services.EstadoCuentaRestService;

@Service
public class EstadoCuentaRestServiceImpl implements EstadoCuentaRestService{
	protected final Log LOG = LogFactory.getLog(this.getClass());
	
	@Autowired
	private EstadoCuentaRestMapper estadoCuentaRestMapper;
	
	@Override
	public List<EstadoCuentaRest> listaEstadoCuentaRest() {
		// TODO Auto-generated method stub
		LOG.info("EstadoCuentaRestServiceImpl: " + "va ejecutar");
		return estadoCuentaRestMapper.selectEstadoCuentaRest();
	}

	@Override
	public EstadoCuentaRest estadoCuentaRestPorUnidadPrivada(int id) {
		// TODO Auto-generated method stub
		return estadoCuentaRestMapper.selectEstadoCuentaRestForUnidadPrivada(id);
	}
	

}
