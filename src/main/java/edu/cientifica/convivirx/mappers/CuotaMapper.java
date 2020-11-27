package edu.cientifica.convivirx.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.cientifica.convivirx.model.Cuota;
import edu.cientifica.convivirx.model.CuotaDetalle;


@Mapper
public interface CuotaMapper {
	
	public List<Cuota>listaCuota();
	public List<Cuota> selectCuota();
	public int insertCuota(Cuota cuota);
	public int insertCuotaDetalle(Cuota cuota);
	
	public int generaId();
	public List<CuotaDetalle> selectGenerarCuotaDetalle(Cuota cuota);
	
	public List<Cuota> selectCuotaByUnidadPrivadaId(int id);
	public Cuota selectCuotaById(int id);
	
}
