package br.com.locadora.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.locadora.dao.UsuarioDao;
import br.com.locadora.dao.UsuarioSession;
import br.com.locadora.model.Usuario;

@Resource
public class LoginController {

	private Result result;
	private UsuarioDao usuarioDao;
	private UsuarioSession usuarioSession;
	
	public LoginController( Result result, UsuarioDao usuarioDao, UsuarioSession usuarioSession ) {
		this.result = result;
		this.usuarioDao = usuarioDao;
		this.usuarioSession = usuarioSession;
	}

	@Get("/login")
	public void login() {
		if( usuarioSession.getUsuario() != null )
			result.redirectTo(LocadoraController.class).index();
	}

	@Post("/login")
	public void login( String login, String senha ) {
		Usuario usuario = usuarioDao.login(login, senha);
		if( usuario == null )
			result.include("mensagem", "Usuário ou senha inválidos.").redirectTo(this).login();
		else {
			usuarioSession.setUsuario(usuario);
			result.redirectTo(LocadoraController.class).index();
		}
	}
	
	@Get("/logout")
	public void logout() {
		usuarioSession.setUsuario(null);
		result.redirectTo(this).login();
	}
}