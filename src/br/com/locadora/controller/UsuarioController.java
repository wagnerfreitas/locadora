package br.com.locadora.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.locadora.dao.UsuarioDao;
import br.com.locadora.model.Usuario;

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
	
	@Get("/new")
	public void formulario() {}
	
	@Post("")
	public void save( Usuario usuario ) {
		usuarioDao.save(usuario);
		result.redirectTo(this).usuarios();
	}
}