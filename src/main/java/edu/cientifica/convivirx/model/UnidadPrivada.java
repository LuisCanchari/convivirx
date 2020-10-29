package edu.cientifica.convivirx.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UnidadPrivada {
	@NotNull
	private int id;

	@NotNull
	@Min(1)
	@Max(2)
	private int tipoUnidad;

	@NotNull
	@Size(min = 2, max = 10)
	private String numeracion;

	
	@Size(min=2, message = "Debe tener mas de dos caracteres")
	private String zona;

	@NotNull
	private UnidadInmobiliaria unidadInmobiliaria;

	public UnidadPrivada() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UnidadPrivada(int id, int tipoUnidad, String numeracion, String zona,
			UnidadInmobiliaria unidadInmobiliaria) {
		super();
		this.id = id;
		this.tipoUnidad = tipoUnidad;
		this.numeracion = numeracion;
		this.zona = zona;
		this.unidadInmobiliaria = unidadInmobiliaria;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTipoUnidad() {
		return tipoUnidad;
	}

	public void setTipoUnidad(int tipoUnidad) {
		this.tipoUnidad = tipoUnidad;
	}

	public String getNumeracion() {
		return numeracion;
	}

	public void setNumeracion(String numeracion) {
		this.numeracion = numeracion;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public UnidadInmobiliaria getUnidadInmobiliaria() {
		return unidadInmobiliaria;
	}

	public void setUnidadInmobiliaria(UnidadInmobiliaria unidadInmobiliaria) {
		this.unidadInmobiliaria = unidadInmobiliaria;
	}

	@Override
	public String toString() {
		return "UnidadPrivada [id=" + id + ", tipoUnidad=" + tipoUnidad + ", numeracion=" + numeracion + ", zona="
				+ zona + ", unidadInmobiliaria=" + unidadInmobiliaria + "]";
	}

}