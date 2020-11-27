package edu.cientifica.convivirx.controller;

import java.nio.file.Path;
import java.util.List;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fasterxml.jackson.databind.ObjectMapper;

import edu.cientifica.convivirx.model.Cuota;
import edu.cientifica.convivirx.model.CuotaDetalle;
import edu.cientifica.convivirx.model.DetalleResponse;
import edu.cientifica.convivirx.model.UnidadPrivada;
import edu.cientifica.convivirx.services.CuotaService;
import edu.cientifica.convivirx.services.UnidadPrivadaService;



@Controller
@RequestMapping("/cuota")
public class CuotaController {
	protected final Log LOG =  LogFactory.getLog(this.getClass());
	
	@Autowired
	private CuotaService cuotaService;
	
	@Autowired
	private UnidadPrivadaService unidadPrivadaService;
	
	
	@RequestMapping("/lista")
	public String listaCuotaAll(Model model) {
		model.addAttribute("cuotas", cuotaService.listaCuota());
		return "cuota_list";
	}
	
	@RequestMapping(value = "/uprivada/{id}", method = RequestMethod.GET)
	public String listaCuotaByUnidadPrivadaId(Model model, @PathVariable(name="id") int id) {
		model.addAttribute("cuotas", cuotaService.listaCuotaByUnidadPrivadaId(id));
		return "cuota_list";
	}
	
	@RequestMapping("/detalle/{id}")
	public String cuotaDetalle(@PathVariable (name = "id") int id) {
		
		return "cuota_list";
	}
	
	@GetMapping("/uprivada/{id}/form")
	public String ingresarCuotaPorUnidadPrivada(Model model,
			@PathVariable (name = "id") int unidadPrivadaId) {
		//Generar un objeto Cuota para la unidad privada
		Cuota nuevaCuota = new Cuota();
		nuevaCuota.setId(cuotaService.generarId());
		nuevaCuota.setUnidadPrivada(unidadPrivadaService.unidadPrivadaById(unidadPrivadaId));
		//nuevaCuota.setListaCuotaDetalle(cuotaService.generarListaCuotaDetalle(nuevaCuota));
		
		model.addAttribute("cuota",nuevaCuota);
		return "cuota_form";
	}
	
	@PostMapping()
	public String registrarCuotaPorUnidadPrivada(@Valid @ModelAttribute("cuota") 
	Cuota cuota, BindingResult errors, Model model, RedirectAttributes atribute) {
		//guardar cuota y generar detalles
		cuota = cuotaService.guardarNuevaCuota(cuota);
		model.addAttribute("cuota",cuota);
		return "cuota_form"; 
	}
	

	@GetMapping("/{id}/detalles")
	public String ingresarCuotaDetalles(Model model, @PathVariable(name = "id") int id) {
		Cuota cuota;
		List<CuotaDetalle> listaCuotaDetalle;
		cuota = cuotaService.obtenerCuotaById(id);
		listaCuotaDetalle =cuotaService.listaCuotaDetallesById(id);
		cuota.setListaCuotaDetalle(listaCuotaDetalle);

		
		for (CuotaDetalle cuotaDetalle : listaCuotaDetalle) {
			LOG.info(cuotaDetalle);
		}
		
		//cuota.setListaCuotaDetalle(cuotaService.generarListaCuotaDetalle(cuota));
		//LOG.info(cuota);
		model.addAttribute("cuota",cuota);
		
		return "cuota_detalle_list";
	}
	
	@PostMapping(value = "/detalles", consumes="application/json" )
	public String guardarCuotaDetalles(@RequestBody List<DetalleResponse> cuotaDetalles) {
		
		int result = cuotaService.guardarListaCuotaDetalle(cuotaDetalles);
		LOG.info("registros insertados: "+ result);
		
		return "success";
	}
	
	@PutMapping(value = "/detalles", consumes="application/json" )
	public String actualizarCuotaDetalles(@RequestBody List<DetalleResponse> cuotaDetalles) {
		
		int result = cuotaService.actualizarListaCuotaDetalle(cuotaDetalles);
		LOG.info("registros insertados: "+ result);
		
		return "success";
	}
	
}
