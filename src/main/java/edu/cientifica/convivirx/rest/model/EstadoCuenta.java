package edu.cientifica.convivirx.rest.model;

import java.util.List;

import edu.cientifica.convivirx.model.Abono;
import edu.cientifica.convivirx.model.Cuota;
import edu.cientifica.convivirx.model.UnidadPrivada;

public class EstadoCuenta {
	private int id;
	private UnidadPrivada unidadPrivada;
	private Double totalCargo;
	private Double totalAbono;
	private Double totalDeuda;
	private List<Cuota> listaCuota;
	private List<Abono> listaAbono;
	
	
	public EstadoCuenta() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		
	public EstadoCuenta(int id, UnidadPrivada unidadPrivada, Double totalCargo, Double totalAbono, Double totalDeuda,
			List<Cuota> listaCuota, List<Abono> listaAbono) {
		super();
		this.id = id;
		this.unidadPrivada = unidadPrivada;
		this.totalCargo = totalCargo;
		this.totalAbono = totalAbono;
		this.totalDeuda = totalDeuda;
		this.listaCuota = listaCuota;
		this.listaAbono = listaAbono;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public UnidadPrivada getUnidadPrivada() {
		return unidadPrivada;
	}
	public void setUnidadPrivada(UnidadPrivada unidadPrivada) {
		this.unidadPrivada = unidadPrivada;
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
	public Double getTotalDeuda() {
		return totalDeuda;
	}
	public void setTotalDeuda(Double totalDeuda) {
		this.totalDeuda = totalDeuda;
	}
	public List<Cuota> getListaCuota() {
		return listaCuota;
	}
	public void setListaCuota(List<Cuota> listaCuota) {
		this.listaCuota = listaCuota;
	}
	public List<Abono> getListaAbono() {
		return listaAbono;
	}
	public void setListaAbono(List<Abono> listaAbono) {
		this.listaAbono = listaAbono;
	}

	@Override
	public String toString() {
		return "EstadoCuenta [id=" + id + ", unidadPrivada=" + unidadPrivada + ", totalCargo=" + totalCargo
				+ ", totalAbono=" + totalAbono + ", totalDeuda=" + totalDeuda + ", listaCuota=" + listaCuota
				+ ", listaAbono=" + listaAbono + "]";
	}
	
	
	
}
