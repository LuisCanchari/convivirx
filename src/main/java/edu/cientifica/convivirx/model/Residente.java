package edu.cientifica.convivirx.model;

public class Residente extends Persona {
	UnidadPrivada unidadPrivada;

	public Residente() {
		super();
	}
	
	

	public Residente(UnidadPrivada unidadPrivada) {
		super();
		this.unidadPrivada = unidadPrivada;
	}



	public UnidadPrivada getUnidadPrivada() {
		return unidadPrivada;
	}

	public void setUnidadPrivada(UnidadPrivada unidadPrivada) {
		this.unidadPrivada = unidadPrivada;
	}
	
	

}
