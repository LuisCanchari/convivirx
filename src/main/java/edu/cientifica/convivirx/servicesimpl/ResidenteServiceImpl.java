package edu.cientifica.convivirx.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import edu.cientifica.convivirx.mappers.ResidenteMapper;
import edu.cientifica.convivirx.model.Residente;
import edu.cientifica.convivirx.model.UnidadPrivada;
import edu.cientifica.convivirx.services.ResidenteService;

@Service
public class ResidenteServiceImpl implements ResidenteService{
	
	@Autowired
	ResidenteMapper residenteMapper;

	@Override
	public List<Residente> listaResidente() {
		List<Residente> listaResidente = residenteMapper.selectResidenteAll();
		
		return listaResidente;
	}

	@Override
	public List<Residente> listaResidente(Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<Residente> listaResidente;
		listaResidente =  residenteMapper.selectResidenteAll();
		return listaResidente;
	}
	
	

}
