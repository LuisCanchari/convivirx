package edu.cientifica.convivirx.servicesimpl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cientifica.convivirx.mappers.AbonoMapper;
import edu.cientifica.convivirx.model.Abono;
import edu.cientifica.convivirx.services.AbonoService;

@Service
public class AbonoServiceImpl implements AbonoService{
	protected final Log LOG =  LogFactory.getLog(this.getClass());
	@Autowired
	AbonoMapper abonoMapper;

	@Override
	public Abono registrarAbono(Abono abono) {
		int result;
		//Completar el id
		abono.setId(abonoMapper.generarAbonoId());

		//Completar fecha local
		Calendar calendar = Calendar.getInstance();
		java.util.Date currentDate = calendar.getTime();
		java.sql.Date date = new java.sql.Date(currentDate.getTime());
		abono.setFechaAbono(date);
		
		LOG.info(abono.toString());
		
		result = abonoMapper.insertAbono(abono);
		if (result==0) {
			abono = null;
		}
		//Completera datos como fecha id  
		// TODO Auto-generated method stub
		
		return abono;
	}

	@Override
	public Abono obtenerAbonoById(int id) {
		// TODO Auto-generated method stub
		return abonoMapper.selectAbonoById(id);
	}
	
	

}
