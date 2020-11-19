package edu.cientifica.convivirx.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.cientifica.convivirx.rest.model.EstadoCuentaRest;

@Mapper
public interface EstadoCuentaRestMapper {
	
	public List<EstadoCuentaRest> selectEstadoCuentaRest();
	
	public EstadoCuentaRest selectEstadoCuentaRestForUnidadPrivada(int id);

}
