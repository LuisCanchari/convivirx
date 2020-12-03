package edu.cientifica.convivirx.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.cientifica.convivirx.model.Residente;

@Mapper
public interface ResidenteMapper {
	public List<Residente> selectResidenteAll();

}
