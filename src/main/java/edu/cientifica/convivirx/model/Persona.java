package edu.cientifica.convivirx.model;

import java.sql.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Persona {
	@NotNull
	private int id;
	
	@NotEmpty
	private int tipoDocumento;
	
	@NotEmpty
	@Pattern (regexp="[0-9]")
	private String numDocumento;
	
	@NotNull
	@Size(min=3, max=50)
	private String nombre;
	
	@Size(min=3, max=50)
	private String primerApellido;
	
	@Size(min=3, max=50)
	private String segundoApellido;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechaNacimiento;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(int tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNumDocumento() {
		return numDocumento;
	}
	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", tipoDocumento=" + tipoDocumento + ", numDocumento=" + numDocumento + ", nombre="
				+ nombre + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
	
}
