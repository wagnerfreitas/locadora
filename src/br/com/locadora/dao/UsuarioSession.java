package br.com.locadora.dao;

import br.com.locadora.model.Usuario;

public interface UsuarioSession {
	public Usuario getUsuario();
	public void setUsuario(Usuario usuario);
}