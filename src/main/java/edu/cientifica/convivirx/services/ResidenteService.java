package edu.cientifica.convivirx.services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.cientifica.convivirx.model.Residente;
import edu.cientifica.convivirx.model.UnidadPrivada;

@Service
public interface ResidenteService {
	public List<Residente> listaResidente(); 
	public List<Residente> listaResidente(Integer pageNum, Integer pageSize);

}
