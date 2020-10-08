package edu.cientifica.convivirx.servicesimpl;

import org.springframework.stereotype.Service;

import edu.cientifica.convivirx.model.Usuario;
import edu.cientifica.convivirx.services.UsuarioService;

@Service
public class UsuarioSeviceImpl implements UsuarioService{

	@Override
	public boolean validarUsuario(Usuario usuario) {
		
		if (usuario.getUsername().equals("Juan")) {
			if (usuario.getPassword().equals("Secreto")) {
				return true ;
			}
		}
		return false;
	}
}
