package edu.cientifica.convivirx.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.cientifica.convivirx.rest.model.EstadoCuenta;
import edu.cientifica.convivirx.rest.model.EstadoCuentaRest;

@Mapper
public interface EstadoCuentaMapper {
	public EstadoCuenta selectEstadoCuentaForUnidadPrivada(int id);
	public List<EstadoCuenta> selectEstadoCuenta();
	public List<EstadoCuentaRest> selectEstadoCuentaCuota();
}
