package edu.cientifica.convivirx.services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.cientifica.convivirx.model.Cuota;

@Service
public interface CuotaService {
	public List<Cuota> listaCuota();

}
