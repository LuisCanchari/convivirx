package edu.cientifica.convivirx.services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.cientifica.convivirx.model.Cuota;
import edu.cientifica.convivirx.model.CuotaDetalle;
import edu.cientifica.convivirx.model.DetalleResponse;

@Service
public interface CuotaService {
	public List<Cuota> listaCuota();
	public List<Cuota> listaCuotaByUnidadPrivadaId(int id);
	public int generarId();
	public Cuota guardarNuevaCuota(Cuota cuota);
	public List<CuotaDetalle> generarListaCuotaDetalle(Cuota cuota);
	public Cuota obtenerCuotaById(int id);
	public int guardarListaCuotaDetalle(List<DetalleResponse> listaDetalleResponse);
	public int actualizarListaCuotaDetalle (List<DetalleResponse> listaDetalleResponse);
	public List<CuotaDetalle> listaCuotaDetallesById(int id); 
	
	
}
