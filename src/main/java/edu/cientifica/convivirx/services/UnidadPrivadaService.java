package edu.cientifica.convivirx.services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.cientifica.convivirx.model.UnidadPrivada;


public interface UnidadPrivadaService {
	public int registrarUnidadPrivada(UnidadPrivada unidadPrivada);
	public List<UnidadPrivada> listarUnidadPrivada();
	public int actualizarUnidadPrivada(UnidadPrivada unidadPrivada);
	public int eliminarUnidadPrivada(int id);
	public UnidadPrivada unidadPrivadaById(int id);
	
	public int generarCodigoUP();
	
	
}
