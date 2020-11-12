package edu.cientifica.convivirx.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cientifica.convivirx.mappers.CuotaMapper;
import edu.cientifica.convivirx.model.Cuota;
import edu.cientifica.convivirx.services.CuotaService;

@Service
public class CuotaServiceImpl implements CuotaService{
	
	@Autowired
	private CuotaMapper cuotaMapper;

	@Override
	public List<Cuota> listaCuota() {
		// TODO Auto-generated method stub
		return cuotaMapper.listaCuota();
	}

}
