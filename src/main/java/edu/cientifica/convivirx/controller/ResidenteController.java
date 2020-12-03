package edu.cientifica.convivirx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;

import edu.cientifica.convivirx.model.Residente;

import edu.cientifica.convivirx.services.ResidenteService;

@Controller
@RequestMapping("/residente")
public class ResidenteController {
	@Autowired
	ResidenteService residenteService;
	
	@RequestMapping("/lista")
	public String obtenerListaResidentes(Model model, 
			@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
			@RequestParam(value = "pageSize", defaultValue = "6") Integer pageSize){
		
		
		List<Residente> listaResidente;
		listaResidente = residenteService.listaResidente(pageNum, pageSize);
		PageInfo<Residente> pageInfo = new PageInfo<Residente>(listaResidente);
		model.addAttribute("pageInfo", pageInfo);
		
		return "residentes_list";
		
	}

}
