package edu.cientifica.convivirx.services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.cientifica.convivirx.model.TipoUnidad;

@Service
public interface TipoUnidadService {
	public List<TipoUnidad> listaTipoUnidad();

}
