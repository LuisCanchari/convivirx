package edu.cientifica.convivirx.rest.model;



import edu.cientifica.convivirx.model.Cuota;


public class EstadoCuentaCuota extends EstadoCuentaMaster{
	private Cuota cuota;

	public Cuota getCuota() {
		return cuota;
	}

	public void setCuota(Cuota cuota) {
		this.cuota = cuota;
	}
	
}
