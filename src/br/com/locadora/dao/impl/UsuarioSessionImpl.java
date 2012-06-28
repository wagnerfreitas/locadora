package br.com.locadora.dao.impl;

import java.io.Serializable;

import javax.servlet.http.HttpSession;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;
import br.com.locadora.dao.UsuarioSession;
import br.com.locadora.model.Usuario;

@SuppressWarnings("serial")
@Component @SessionScoped
public class UsuarioSessionImpl implements UsuarioSession, Serializable {
	
	private HttpSession httpSession;
	
	public UsuarioSessionImpl( HttpSession httpSession ) {
		this.httpSession = httpSession;
	}

	public Usuario getUsuario() {
		return (Usuario) httpSession.getAttribute("usuario");
	}

	public void setUsuario(Usuario usuario) {
		httpSession.setAttribute("usuario", usuario);
	}
}