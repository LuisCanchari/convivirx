package edu.cientifica.convivirx.rest.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.ObjectMapper;

import edu.cientifica.convivirx.rest.model.EstadoCuentaCuota;
import edu.cientifica.convivirx.rest.model.EstadoCuentaRest;
import edu.cientifica.convivirx.rest.model.EstadoCuentaUPrivada;
import edu.cientifica.convivirx.rest.model.ListaEstadoCuentaCuota;
import edu.cientifica.convivirx.rest.model.ListaEstadoCuentaUprivada;
import edu.cientifica.convivirx.services.EstadoCuentaCuotaService;
import edu.cientifica.convivirx.services.EstadoCuentaRestService;
import edu.cientifica.convivirx.services.EstadoCuentaUPrivadaService;

@RestController
@RequestMapping("/rest/estadocuenta")
public class EstadoCuentaRestController {
	protected final Log LOG = LogFactory.getLog(this.getClass());

	@Autowired
	private EstadoCuentaRestService estadoCuentaRestService;

	@Autowired
	private EstadoCuentaCuotaService estadoCuentaCuotaService;

	@Autowired
	private EstadoCuentaUPrivadaService estadoCuentaUPrivadaService;

	@RequestMapping("/all")
	public List<EstadoCuentaRest> getListaEstadoCuentaRest() {
		return estadoCuentaRestService.listaEstadoCuentaRest();

	}

	@RequestMapping("/uprivada/{id}")
	public EstadoCuentaRest getListaEstadoCuentaForUnidadPrivada(@PathVariable("id") int id) {
		return estadoCuentaRestService.estadoCuentaRestPorUnidadPrivada(id);

	}

	@RequestMapping("/demo")
	public List<EstadoCuentaRest> demo() {
		return estadoCuentaRestService.listaEstadoCuentaRest();
	}

	@RequestMapping(value = "/uprivada/all", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<ListaEstadoCuentaUprivada> getEstadoCuentaUPrivadaAll() {
		ListaEstadoCuentaUprivada data = new ListaEstadoCuentaUprivada();
		data.setData(estadoCuentaUPrivadaService.listaEstadoCuentaUPrivadaAll());

		// data.setListaEstadoCuentaUprivada(estadoCuentaUPrivadaService.listaEstadoCuentaUPrivadaAll());

		if (data.getData().isEmpty()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<>(data, HttpStatus.OK);
		}
	}

	@RequestMapping(value = "/cuota/uprivada/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<ListaEstadoCuentaCuota> getEstadoCuentaCuotaByUPrivada(@PathVariable(name = "id") int id) {
		LOG.info("getEstadoCuentaCuotaByUPrivada : " + id);

		ListaEstadoCuentaCuota data = new ListaEstadoCuentaCuota();
		data.setData(estadoCuentaCuotaService.listaEstadoCuentaCuotaByUprivada(id));

		if (data.getData().isEmpty()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<>(data, HttpStatus.OK);
		}
	}

	@RequestMapping(value = "/cuota/all", method = RequestMethod.GET)
	public List<EstadoCuentaCuota> getEstadoCuentaCuotaAll() {
		List<EstadoCuentaCuota> lisEstadoCuentaCuotas;
		lisEstadoCuentaCuotas = estadoCuentaCuotaService.listaEstadoCuentaCuotaAll();

		return lisEstadoCuentaCuotas;
	}

}
