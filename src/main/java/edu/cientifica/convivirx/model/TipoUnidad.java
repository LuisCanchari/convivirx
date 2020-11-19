package edu.cientifica.convivirx.model;

public class TipoUnidad {
	private int id;
	private String descripcion;
	
	
	
	public TipoUnidad() {
		super();
	}
	
	public TipoUnidad(int id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

}
