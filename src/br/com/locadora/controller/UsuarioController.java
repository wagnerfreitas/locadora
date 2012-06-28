package br.com.locadora.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.locadora.dao.UsuarioDao;

@Resource @Path("/usuarios")
public class UsuarioController {
	
	private Result result;
	private UsuarioDao usuarioDao;
	
	public UsuarioController( Result result, UsuarioDao usuarioDao ) {
		this.result = result;
		this.usuarioDao = usuarioDao;
	}
	
	@Get("")
	public void usuarios() {
		result.include("usuarios", usuarioDao.list());
	}
}