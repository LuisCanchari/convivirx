package edu.cientifica.convivirx.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.cientifica.convivirx.model.Cuota;

@Mapper
public interface CuotaMapper {
	
	public List<Cuota>listaCuota();

}
