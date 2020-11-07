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
public class UnidadPrivadaServiceImpl implements UnidadPrivadaService {
	protected final Log LOG = LogFactory.getLog(this.getClass());

	@Autowired // Inyecccion de dependencia
	UnidadPrivadaMapper unidadPrivadaMapper;

	@Override
	public int registrarUnidadPrivada(UnidadPrivada unidadPrivada) {
		int result;
		result = unidadPrivadaMapper.insertUnidadPrivada(unidadPrivada);
		LOG.info("Numero de registros afectados : " + result);
		return result;
	}

	@Override
	public List<UnidadPrivada> listarUnidadPrivada() {

		//LOG.info("Unidades: " + unidadPrivadaMapper.findAllUnidadPrivada());
		return unidadPrivadaMapper.findAllUnidadPrivada();
	}

	@Override
	public int actualizarUnidadPrivada(UnidadPrivada unidadPrivada) {
		int result;
		result = unidadPrivadaMapper.updateUnidadPrivada(unidadPrivada);
		LOG.info("Numero de registros afectados : " + result);
		return result;
	}

	@Override
	public int eliminarUnidadPrivada(int id) {
		int result;
		result = unidadPrivadaMapper.deleteUnidadPrivada(id);
		LOG.info("Numero de registros afectados : " + result);
		return result;
	}

	@Override
	public UnidadPrivada unidadPrivadaById(int id) {
		UnidadPrivada unidadPrivada;
		unidadPrivada = unidadPrivadaMapper.findUnidadPrivadaById(id);

		return unidadPrivada;
	}

	@Override
	public int generarCodigoUP() {
		// TODO Auto-generated method stub
		return unidadPrivadaMapper.generarCodigoUP();

	}

	@Override
	public UnidadPrivada save(UnidadPrivada unidadPrivada) {
		
		int result = unidadPrivadaMapper.insertUnidadPrivada(unidadPrivada);
		if (result != 0) {
			return unidadPrivada;
		}
		return null;

	}

	@Override
	public boolean delete(int unidadPrivadaId) {
		int result = unidadPrivadaMapper.deleteUnidadPrivada(unidadPrivadaId);
		if (result != 0) {
			return true;
		}

		return false;
	}

	@Override
	public List<UnidadPrivada> unidadPrivadaByCondominio(int condominioId) {
		// TODO Auto-generated method stub
		return unidadPrivadaMapper.findUnidadPrivadaByCondomio(condominioId);
		
	}
	
	

}
