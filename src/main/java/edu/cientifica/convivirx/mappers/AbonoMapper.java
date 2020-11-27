package edu.cientifica.convivirx.mappers;

import org.apache.ibatis.annotations.Mapper;

import edu.cientifica.convivirx.model.Abono;

@Mapper
public interface AbonoMapper {
	public int generarAbonoId();
	public Abono selectAbonoById(int id);
	public int insertAbono(Abono abono);

}
