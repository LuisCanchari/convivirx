package edu.cientifica.convivirx.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.cientifica.convivirx.rest.model.EstadoCuentaUPrivada;

@Mapper
public interface EstadoCuentaUPrivadaMapper {
	
	public List<EstadoCuentaUPrivada> selectEstadoCuentaUPrivadaAll();

}
