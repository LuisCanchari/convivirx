package edu.cientifica.convivirx.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import edu.cientifica.convivirx.model.UnidadPrivada;


public interface UnidadPrivadaService {
	public int registrarUnidadPrivada(UnidadPrivada unidadPrivada);
	public List<UnidadPrivada> listarUnidadPrivada();
	public int actualizarUnidadPrivada(UnidadPrivada unidadPrivada);
	public int eliminarUnidadPrivada(int id);
	public UnidadPrivada unidadPrivadaById(int id);
	
	
	public int generarCodigoUP();
	
	public UnidadPrivada save(UnidadPrivada unidadPrivada);
	public boolean delete(int unidadPrivadaId);
	
	public List<UnidadPrivada> unidadPrivadaByCondominio(int condominioId);
	
	
}
