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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.cientifica.convivirx.model.UnidadInmobiliaria;
import edu.cientifica.convivirx.model.UnidadPrivada;
import edu.cientifica.convivirx.services.UnidadInmobiliariaService;
import edu.cientifica.convivirx.services.UnidadPrivadaService;

@Controller
@RequestMapping("/uprivada")
public class UPrivadaController {
	protected final Log LOG =  LogFactory.getLog(this.getClass());

	@Autowired
	UnidadPrivadaService unidadPrivadaService;
	@Autowired
	UnidadInmobiliariaService unidadInmobiliariaService;

	@GetMapping("/lista")
	public String listaUnidad(Model model) {
		List<UnidadPrivada> listUnidadPrivada;
		listUnidadPrivada = unidadPrivadaService.listarUnidadPrivada();
		model.addAttribute("unidades", listUnidadPrivada);
		return "uprivada_list";
	}

	@GetMapping("/form")
	public String formularioUnidad(Model model)  {
		List<UnidadInmobiliaria> listaUnidadInmobiliara= null;
		UnidadPrivada unidadPrivada = new UnidadPrivada();
		listaUnidadInmobiliara = unidadInmobiliariaService.listarUnidadInmobiliaria();
		
		model.addAttribute("Uprivada", unidadPrivada);
		model.addAttribute("listaUnidadInmobiliaria",listaUnidadInmobiliara);

		return "uprivada_form";
	}

	@PostMapping("/registrar")
	public String registrarUnidad( @Valid @ModelAttribute("Uprivada") UnidadPrivada unidadPrivada, 
			BindingResult errors, Model model, RedirectAttributes atribute) {
		int result = 0;
		
		if (errors.hasErrors()) {
			//model.addAttribute("Uprivada", unidadPrivada);
			//return "uprivada_form";
			LOG.info("numero de errores"+errors.getErrorCount());
			return ("redirect:/uprivada/form");
		}
		
		LOG.info("DATOS CAPTURADOS: "+ unidadPrivada.toString());

		try {
			result =unidadPrivadaService.registrarUnidadPrivada(unidadPrivada);
		} catch (Exception e) {
			LOG.info(e.getMessage());
		}

		return "redirect:/uprivada/lista";
	}

}
