package edu.cientifica.convivirx.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import edu.cientifica.convivirx.model.UnidadPrivada;

@Mapper
public interface UnidadPrivadaMapper {
	
	public List<UnidadPrivada> findAllUnidadPrivada();
	public UnidadPrivada findUnidadPrivadaById(int id);
	public int insertUnidadPrivada(UnidadPrivada unidadPrivada);
	public int insertUnidadPrivadaPropietario(UnidadPrivada unidadPrivada);
	public int updateUnidadPrivada(UnidadPrivada unidadPrivada); 
	public int  updateUnidadPrivadaPropietario(UnidadPrivada unidadPrivada);
	
	@Delete("DELETE FROM unidadprivada WHERE id_uprivada= #{id}")
	public int deleteUnidadPrivada(int id);
	
	@Select("SELECT IFNULL(max(id_uprivada), 0)+1 as id from unidadprivada")
	@ResultType(Integer.class)
	public int generarCodigoUP();
	
	
	@Select("SELECT * FROM unidadprivada up INNER JOIN unidadinmobiliaria ui ON up.id_uinmobiliaria=ui.id_uinmobiliaria "
			+ "where up.id_uinmobiliaria = #{condominioId}")
	@ResultMap("edu.cientifica.convivirx.mappers.UnidadPrivadaMapper.unidadPrivadaResultMap")
	public List<UnidadPrivada> findUnidadPrivadaByCondomio(int condominioId);
	
	
}
