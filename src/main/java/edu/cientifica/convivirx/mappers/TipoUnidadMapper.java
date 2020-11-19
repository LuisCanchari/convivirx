package edu.cientifica.convivirx.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.cientifica.convivirx.model.TipoUnidad;

@Mapper
public interface TipoUnidadMapper {
	public List<TipoUnidad> selectTipoUnidadAll();

}
