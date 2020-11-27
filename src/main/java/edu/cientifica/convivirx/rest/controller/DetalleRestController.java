package edu.cientifica.convivirx.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.cientifica.convivirx.model.CuotaDetalle;
import edu.cientifica.convivirx.rest.model.ListaCuotaDetalle;
import edu.cientifica.convivirx.services.DetalleService;

@RestController
@RequestMapping("/rest/detalle")
public class DetalleRestController {
	
	@Autowired 
	private DetalleService detalleService;
	
	
	@GetMapping("/cuota/{id}")
	@ResponseBody
	public ResponseEntity<ListaCuotaDetalle> getCuotaDetalleByCuota(@PathVariable (name = "id") int id){
		
		
		ListaCuotaDetalle data = new ListaCuotaDetalle();
		data.setData(detalleService.listaCuotaDetalleByCuota(id));
		
		if (data.getData().isEmpty()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			
		}else {
			return new ResponseEntity<>(data, HttpStatus.OK);
		}
	
	}

}
