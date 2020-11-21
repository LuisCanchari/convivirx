package edu.cientifica.convivirx.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UnidadPrivada {
	@NotNull
	private int id;

	@NotNull
	@Size(min = 2, max = 10, message = "La numeracion debe ser de dos digitos")
	private String numeracion;

	@Size(min = 2, message = "La zona debe tener mas de dos caracteres")
	private String zona;
	
	@NotNull
	private TipoUnidad tipoUnidad;

	@NotNull
	private UnidadInmobiliaria unidadInmobiliaria;

	private Propietario propietario;

	
	public UnidadPrivada() {
		super();

	}


	public UnidadPrivada(@NotNull int id, @NotNull TipoUnidad tipoUnidad,
			@NotNull @Size(min = 2, max = 10, message = "La numeracion debe ser de dos digitos") String numeracion,
			@Size(min = 2, message = "La zona debe tener mas de dos caracteres") String zona,
			@NotNull UnidadInmobiliaria unidadInmobiliaria, Propietario propietario) {
		super();
		this.id = id;
		this.tipoUnidad = tipoUnidad;
		this.numeracion = numeracion;
		this.zona = zona;
		this.unidadInmobiliaria = unidadInmobiliaria;
		this.propietario = propietario;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public TipoUnidad getTipoUnidad() {
		return tipoUnidad;
	}


	public void setTipoUnidad(TipoUnidad tipoUnidad) {
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


	public Propietario getPropietario() {
		return propietario;
	}


	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}


	@Override
	public String toString() {
		return "UnidadPrivada [id=" + id + ", tipoUnidad=" + tipoUnidad + ", numeracion=" + numeracion + ", zona="
				+ zona + ", unidadInmobiliaria=" + unidadInmobiliaria + ", propietario=" + propietario + "]";
	}
	

}
