package edu.cientifica.convivirx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import edu.cientifica.convivirx.model.Usuario;
import edu.cientifica.convivirx.services.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@PostMapping("/validar")
	public String validarUsuario(Model model, @RequestParam(name = "username") String username,
			@RequestParam(name = "password") String password) {
		Usuario usuario = new Usuario(0, username, password);

		if (usuarioService.validarUsuario(usuario)) {
			return "redirect:/principal";

		}
		return "login";
	}

}
