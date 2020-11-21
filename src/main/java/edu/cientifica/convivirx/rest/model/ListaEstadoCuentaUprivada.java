package edu.cientifica.convivirx.rest.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeName;

/*@JsonTypeName(value = "data")*/
public class ListaEstadoCuentaUprivada {
	
	private List<EstadoCuentaUPrivada> data;

	public List<EstadoCuentaUPrivada> getData() {
		return data;
	}

	public void setData(List<EstadoCuentaUPrivada> data) {
		this.data = data;
	}

		

}
