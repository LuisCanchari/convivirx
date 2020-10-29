package edu.cientifica.convivirx.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import edu.cientifica.convivirx.model.UnidadInmobiliaria;
import edu.cientifica.convivirx.model.UnidadPrivada;

@Mapper
public interface UnidadInmobiliariaMapper {
	
	
	@Select("SELECT * FROM unidadinmobiliaria")
	@ResultMap("edu.cientifica.convivirx.mappers.UnidadInmobiliariaMapper.unidadInmobiliariaResultMap")
	public List<UnidadInmobiliaria> findAllUnidadInmobiliaria();

}
