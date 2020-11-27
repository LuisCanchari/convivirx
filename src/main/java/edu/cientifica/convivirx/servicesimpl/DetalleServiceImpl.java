package edu.cientifica.convivirx.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cientifica.convivirx.mappers.CuotaDetalleMapper;
import edu.cientifica.convivirx.model.CuotaDetalle;
import edu.cientifica.convivirx.services.DetalleService;

@Service
public class DetalleServiceImpl implements DetalleService{
	@Autowired
	private CuotaDetalleMapper cuotaDetalleMapper;

	@Override
	public List<CuotaDetalle> listaCuotaDetalleByCuota(int id) {
		// TODO Auto-generated method stub
		return cuotaDetalleMapper.selectCuotaDetalleByCuota(id);
	}
	

}
