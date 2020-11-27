package edu.cientifica.convivirx.services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.cientifica.convivirx.model.CuotaDetalle;

@Service
public interface DetalleService {
	public List<CuotaDetalle> listaCuotaDetalleByCuota(int id);

}
