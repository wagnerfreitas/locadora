package br.com.locadora.controller;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.locadora.dao.UsuarioDao;

@Resource
public class UsuarioController {
	
	private Result result;
	private UsuarioDao usuarioDao;
	
	public UsuarioController( Result result, UsuarioDao usuarioDao ) {
		this.result = result;
		this.usuarioDao = usuarioDao;
	}
}