package edu.cientifica.convivirx.rest.model;

public class EstadoCuentaRest {
	 
	
	private int idUPrivada;
	private int idUInmobiliaria;
	private String numVivienda;
	private int tipoVivienda;
	private String namePropietario;
	private Double montoTotal;
	 
	public EstadoCuentaRest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public EstadoCuentaRest(int idUPrivada, int idUInmobiliaria, String numVivienda, int tipoVivienda,
			String namePropietario, Double montoTotal) {
		super();
		this.idUPrivada = idUPrivada;
		this.idUInmobiliaria = idUInmobiliaria;
		this.numVivienda = numVivienda;
		this.tipoVivienda = tipoVivienda;
		this.namePropietario = namePropietario;
		this.montoTotal = montoTotal;
	}



	public int getIdUPrivada() {
		return idUPrivada;
	}

	public void setIdUPrivada(int idUPrivada) {
		this.idUPrivada = idUPrivada;
	}

	public int getIdUInmobiliaria() {
		return idUInmobiliaria;
	}

	public void setIdUInmobiliaria(int idUInmobiliaria) {
		this.idUInmobiliaria = idUInmobiliaria;
	}

	public String getNumVivienda() {
		return numVivienda;
	}

	public void setNumVivienda(String numVivienda) {
		this.numVivienda = numVivienda;
	}

	public int getTipoVivienda() {
		return tipoVivienda;
	}

	public void setTipoVivienda(int tipoVivienda) {
		this.tipoVivienda = tipoVivienda;
	}

	public String getNamePropietario() {
		return namePropietario;
	}

	public void setNamePropietario(String namePropietario) {
		this.namePropietario = namePropietario;
	}

	public Double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(Double montoTotal) {
		this.montoTotal = montoTotal;
	}

	@Override
	public String toString() {
		return "EstadoCuentaRest [idUPrivada=" + idUPrivada + ", idUInmobiliaria=" + idUInmobiliaria + ", numVivienda="
				+ numVivienda + ", tipoVivienda=" + tipoVivienda + ", namePropietario=" + namePropietario
				+ ", montoTotal=" + montoTotal + "]";
	}
	
	
		 
}
