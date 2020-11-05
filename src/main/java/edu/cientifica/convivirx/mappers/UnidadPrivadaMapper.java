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
	
	@Select("SELECT * FROM unidadprivada up INNER JOIN unidadinmobiliaria ui ON up.id_uinmobiliaria=ui.id_uinmobiliaria "
			+ "order by up.id_uprivada asc")
	@ResultMap("edu.cientifica.convivirx.mappers.UnidadPrivadaMapper.unidadPrivadaResultMap")
	public List<UnidadPrivada> findAllUnidadPrivada();
	
	
	@Select("SELECT * FROM unidadprivada WHERE id_uprivada = #{id}" )
	@ResultMap("edu.cientifica.convivirx.mappers.UnidadPrivadaMapper.unidadPrivadaResultMap")
	public UnidadPrivada findUnidadPrivadaById(int id);
	
	
	
	
	@Insert("INSERT INTO unidadprivada (id_uprivada, tipo_unidad, numeracion, zona, id_uinmobiliaria) "
			+ "VALUES (#{id}, #{tipoUnidad}, #{numeracion}, #{zona}, #{unidadInmobiliaria.id})" )
	public int insertUnidadPrivada(UnidadPrivada unidadPrivada);
	
	@Update("UPDATE unidadprivada SET tipo_unidad= #{tipoUnidad}, numeracion=#{numeracion}, zona=#{zona}, "
			+"id_uinmobiliaria=#{unidadInmobiliaria.id} WHERE id_uprivada= #{id}")
	public int updateUnidadPrivada(UnidadPrivada unidadPrivada); 
	
	@Delete("DELETE FROM unidadprivada WHERE id_uprivada= #{id}")
	public int deleteUnidadPrivada(int id);
	
	@Select("select max(id_uprivada) + 1 as codigo from unidadprivada")
	@ResultType(Integer.class)
	public int generarCodigoUP();
	
}
