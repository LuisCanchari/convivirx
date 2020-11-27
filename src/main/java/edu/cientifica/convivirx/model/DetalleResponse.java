package edu.cientifica.convivirx.model;

public class DetalleResponse {
	
	private int id;
	private int cuotaId;
	private int conceptoId;
	private double monto;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCuotaId() {
		return cuotaId;
	}
	public void setCuotaId(int cuotaId) {
		this.cuotaId = cuotaId;
	}
	public int getConceptoId() {
		return conceptoId;
	}
	public void setConceptoId(int conceptoId) {
		this.conceptoId = conceptoId;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	@Override
	public String toString() {
		return "DetalleResponse [id=" + id + ", cuotaId=" + cuotaId + ", conceptoId=" + conceptoId + ", monto=" + monto
				+ "]";
	}
	
}
