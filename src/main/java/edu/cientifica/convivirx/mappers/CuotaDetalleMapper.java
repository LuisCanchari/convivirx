package edu.cientifica.convivirx.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import edu.cientifica.convivirx.model.CuotaDetalle;
import edu.cientifica.convivirx.model.DetalleResponse;

@Mapper
public interface CuotaDetalleMapper {
	public int insertBatchDetalle(@Param("listaDetalle")List<DetalleResponse> listaDetalle);
	public int updateBatchDetalle(@Param("listaDetalle")List<DetalleResponse> listaDetalle);
	public List<CuotaDetalle> selectListaCuotaDetalleById(int id);
	
	public List<CuotaDetalle> selectCuotaDetalleByCuota(int id);
	
		
	//@Param("attendingUsrList") List<FBEventModel>attendingUsrList
}
