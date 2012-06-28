package br.com.locadora.dao;

import java.util.List;

import br.com.locadora.model.Usuario;

public interface UsuarioDao {
	public List<Usuario> list();
	public void save(Usuario usuario);
	public Usuario login(String login, String senha);
}