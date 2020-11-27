package edu.cientifica.convivirx.services;

import org.springframework.stereotype.Service;

import edu.cientifica.convivirx.model.Abono;

@Service
public interface AbonoService {
	public Abono obtenerAbonoById(int id);
	public Abono registrarAbono(Abono abono);

}
