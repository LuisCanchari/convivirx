package edu.cientifica.convivirx.rest.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import edu.cientifica.convivirx.model.UnidadPrivada;


public class EstadoCuentaUPrivada extends EstadoCuentaMaster{
	private UnidadPrivada unidadPrivada;

	public UnidadPrivada getUnidadPrivada() {
		return unidadPrivada;
	}

	public void setUnidadPrivada(UnidadPrivada unidadPrivada) {
		this.unidadPrivada = unidadPrivada;
	}
	
}
