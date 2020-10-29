package edu.cientifica.convivirx.services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.cientifica.convivirx.model.UnidadPrivada;


public interface UnidadPrivadaService {
	public int registrarUnidadPrivada(UnidadPrivada unidadPrivada);
	public List<UnidadPrivada> listarUnidadPrivada();
}
