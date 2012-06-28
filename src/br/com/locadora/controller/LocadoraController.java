package br.com.locadora.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.locadora.dao.UsuarioSession;

@Resource
public class LocadoraController {
	
	private Result result;
	private UsuarioSession usuarioSession;
	
	public LocadoraController( Result result, UsuarioSession usuarioSession ) {
		this.result = result;
		this.usuarioSession = usuarioSession;
	}
	
	@Get("/")
	public void index() {
		if( usuarioSession.getUsuario() == null )
			result.redirectTo(LoginController.class).login();
	}
}