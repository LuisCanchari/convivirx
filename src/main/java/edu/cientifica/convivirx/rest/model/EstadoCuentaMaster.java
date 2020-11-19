package edu.cientifica.convivirx.rest.model;

import java.sql.Date;
import java.util.List;

public class EstadoCuentaMaster {
	private int id;
	private Double totalCargo;
	private Double totalAbono;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getTotalCargo() {
		return totalCargo;
	}
	public void setTotalCargo(Double totalCargo) {
		this.totalCargo = totalCargo;
	}
	public Double getTotalAbono() {
		return totalAbono;
	}
	public void setTotalAbono(Double totalAbono) {
		this.totalAbono = totalAbono;
	}
	
}
