package edu.cientifica.convivirx.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.cientifica.convivirx.model.Persona;
import edu.cientifica.convivirx.model.UnidadInmobiliaria;
import edu.cientifica.convivirx.model.UnidadPrivada;
import edu.cientifica.convivirx.services.PersonaService;
import edu.cientifica.convivirx.services.UnidadInmobiliariaService;
import edu.cientifica.convivirx.services.UnidadPrivadaService;

@Controller
@RequestMapping("/uprivada")
public class UPrivadaController {
	protected final Log LOG =  LogFactory.getLog(this.getClass());

	@Autowired
	private UnidadPrivadaService unidadPrivadaService;
	@Autowired
	private UnidadInmobiliariaService unidadInmobiliariaService;
	
	@Autowired
	private PersonaService personaService;

	@GetMapping("/lista")
	public String listaUnidad(Model model) {
		List<UnidadPrivada> listUnidadPrivada;
		listUnidadPrivada = unidadPrivadaService.listarUnidadPrivada();
		model.addAttribute("unidades", listUnidadPrivada);
		return "uprivada_list";
	}

	@GetMapping("/form")
	public String formularioUnidad(Model model)  {
		List<UnidadInmobiliaria> listaUnidadInmobiliara = unidadInmobiliariaService.listarUnidadInmobiliaria();
		List<Persona> listaPersona =  personaService.listaPersona();
		
		UnidadPrivada unidadPrivada = new UnidadPrivada();
		unidadPrivada.setId(unidadPrivadaService.generarCodigoUP());
		
		
		model.addAttribute("Uprivada", unidadPrivada);
		model.addAttribute("listaUnidadInmobiliaria",listaUnidadInmobiliara);
		model.addAttribute("listaPersona",listaPersona);

		return "uprivada_form";
	}
	
	@GetMapping("/edit/{id}")
	public String frmEditarUnidad(Model model, @PathVariable(name="id") int id)  {
		List<UnidadInmobiliaria> listaUnidadInmobiliara = unidadInmobiliariaService.listarUnidadInmobiliaria();
		List<Persona> listaPersona =  personaService.listaPersona();
		
		UnidadPrivada unidadPrivada = unidadPrivadaService.unidadPrivadaById(id);
		
		model.addAttribute("Uprivada", unidadPrivada);
		model.addAttribute("listaUnidadInmobiliaria",listaUnidadInmobiliara);
		model.addAttribute("listaPersona",listaPersona);

		return "uprivada_edit";
	}

	@PostMapping("/registrar")
	public String registrarUnidad( @Valid @ModelAttribute("Uprivada") UnidadPrivada unidadPrivada, 
			BindingResult errors, Model model, RedirectAttributes atribute) {
		
		List<UnidadInmobiliaria> listaUnidadInmobiliara = unidadInmobiliariaService.listarUnidadInmobiliaria();
		
		if (errors.hasErrors()) {
			LOG.info("numero de errores: "+errors.getErrorCount());
			for (ObjectError oe : errors.getAllErrors()) {
				LOG.info("error "+oe.getCode()+" "+oe.getObjectName()+oe.getDefaultMessage());
			}
			model.addAttribute("listaUnidadInmobiliaria",listaUnidadInmobiliara);
			return ("uprivada_form");
		}
		

		try {
			int result =unidadPrivadaService.registrarUnidadPrivada(unidadPrivada);
		} catch (Exception e) {
			LOG.error("UPrivadaController: "+ e.getMessage()+" "+e.getCause());
		}

		return "redirect:/uprivada/lista";
	}
	
	@PostMapping("/actualizar")
	public String actualizarUnidad( @Valid @ModelAttribute("Uprivada") UnidadPrivada unidadPrivada, 
			BindingResult errors, Model model, RedirectAttributes atribute) {
		
		List<UnidadInmobiliaria> listaUnidadInmobiliara = unidadInmobiliariaService.listarUnidadInmobiliaria();
		
		if (errors.hasErrors()) {
			
			for (ObjectError oe : errors.getAllErrors()) {
				LOG.info("error"+oe.getCode()+" "+oe.getObjectName()+oe.getDefaultMessage());
			}
			model.addAttribute("listaUnidadInmobiliaria",listaUnidadInmobiliara);
			return ("uprivada_form");
		}
		
		LOG.info("UNIDAD PRIVADA"+unidadPrivada.toString());
		
		try {
			
			int result =unidadPrivadaService.actualizarUnidadPrivada(unidadPrivada);
		} catch (Exception e) {
			LOG.info(e.getMessage());
		}

		return "redirect:/uprivada/lista";
	}

}
