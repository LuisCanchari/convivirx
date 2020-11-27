package edu.cientifica.convivirx.servicesimpl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.cientifica.convivirx.mappers.CuotaDetalleMapper;
import edu.cientifica.convivirx.mappers.CuotaMapper;
import edu.cientifica.convivirx.model.Cuota;
import edu.cientifica.convivirx.model.CuotaDetalle;
import edu.cientifica.convivirx.model.DetalleResponse;
import edu.cientifica.convivirx.services.CuotaService;

@Service
public class CuotaServiceImpl implements CuotaService{
	protected final Log LOG =  LogFactory.getLog(this.getClass());
	
	@Autowired
	private CuotaMapper cuotaMapper;
	
	@Autowired
	private CuotaDetalleMapper cuotaDetalleMapper;

	@Override
	public List<Cuota> listaCuota() {
 
		return cuotaMapper.listaCuota();
	}
	
	@Override
	public Cuota obtenerCuotaById(int id) {
 
		return cuotaMapper.selectCuotaById(id);
	}

	@Override
	public int generarId() {
		return cuotaMapper.generaId();
	}

	@Override
	public List<CuotaDetalle> generarListaCuotaDetalle(Cuota cuota) {
		return cuotaMapper.selectGenerarCuotaDetalle(cuota);
	}

	@Override
	@Transactional
	public Cuota guardarNuevaCuota(Cuota cuota) {
		int result;
		cuotaMapper.insertCuota(cuota);
		result = cuotaMapper.insertCuotaDetalle(cuota);
		if (result >0) {
			//leer los detalles y asignar a la cuota
			cuota.setListaCuotaDetalle(cuotaDetalleMapper.selectListaCuotaDetalleById(cuota.getId()));
		}
		//devolver la cuota
		return cuota;
	}

	@Override
	public List<Cuota> listaCuotaByUnidadPrivadaId(int id) {
		return cuotaMapper.selectCuotaByUnidadPrivadaId(id);
	}

	@Override
	@Transactional
	public int guardarListaCuotaDetalle(List<DetalleResponse> listaDetalleResponse) {
		// TODO Auto-generated method stub
		int result = 0; 
		LOG.info("Numero de registros a procesar:" + listaDetalleResponse.size());
		if (listaDetalleResponse.size()>0) {
			
			result = cuotaDetalleMapper.insertBatchDetalle(listaDetalleResponse);
		}
		
		return result;
	}

	@Override
	@Transactional
	public int actualizarListaCuotaDetalle(List<DetalleResponse> listaDetalleResponse) {
		// TODO Auto-generated method stub
		int result = 0; 
		LOG.info("Numero de registros a procesar:" + listaDetalleResponse.size());
		for (DetalleResponse detalleResponse : listaDetalleResponse) {
			LOG.info(detalleResponse.toString());
			
		}
		
		if (listaDetalleResponse.size()>0) {
			
			result = cuotaDetalleMapper.updateBatchDetalle(listaDetalleResponse);
		}
		
		return result;
	}

	@Override
	public List<CuotaDetalle> listaCuotaDetallesById(int id) {
		
		return cuotaDetalleMapper.selectListaCuotaDetalleById(id);
	}
	
	
	
	

}
