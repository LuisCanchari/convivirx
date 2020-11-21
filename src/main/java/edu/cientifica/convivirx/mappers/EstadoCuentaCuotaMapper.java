package edu.cientifica.convivirx.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.cientifica.convivirx.rest.model.EstadoCuentaCuota;


@Mapper
public interface EstadoCuentaCuotaMapper {
	
	public List<EstadoCuentaCuota> selectEstadoCuentaCuotaAll();
	
	public List<EstadoCuentaCuota> selectEstadoCuentaCuotaByUprivada(int id);

}
