package edu.cientifica.convivirx.model;

import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cuota {
	private int id;
	private int numCuota;
	private String titulo;
	private String anio;
	private String mes;
	private Date fechaEmision;
	private Date fechaVencimiento;
	private UnidadPrivada unidadPrivada;
	private double montoTotal;


	public Cuota() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cuota(int id, int numCuota, String titulo, String anio, String mes, Date fechaEmision, Date fechaVencimiento,
			UnidadPrivada unidadPrivada) {
		super();
		this.id = id;
		this.numCuota = numCuota;
		this.titulo = titulo;
		this.anio = anio;
		this.mes = mes;
		this.fechaEmision = fechaEmision;
		this.fechaVencimiento = fechaVencimiento;
		this.unidadPrivada = unidadPrivada;
		this.montoTotal = montoTotal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumCuota() {
		return numCuota;
	}

	public void setNumCuota(int numCuota) {
		this.numCuota = numCuota;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public Date getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public UnidadPrivada getUnidadPrivada() {
		return unidadPrivada;
	}

	public void setUnidadPrivada(UnidadPrivada unidadPrivada) {
		this.unidadPrivada = unidadPrivada;
	}

	public double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}
	
	

}
