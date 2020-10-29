package edu.cientifica.convivirx.model;

import java.sql.Date;

public class Cuota {
 private int id;
 private String titulo;
 private String anio;
 private String mes;
 private Date fechaEmision;
 private Date fechaVencimiento;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
 
 
 
 }
