package br.com.locadora.dao.impl;

import java.util.List;

import org.hibernate.Session;

import br.com.caelum.vraptor.ioc.Component;
import br.com.locadora.dao.UsuarioDao;
import br.com.locadora.model.Usuario;

@Component
public class UsuarioDaoImpl implements UsuarioDao {

	private Session session;
	
	public UsuarioDaoImpl( Session session ) {
		this.session = session;
	}
	
	@SuppressWarnings("unchecked")
	public List<Usuario> list() {
		return session.createCriteria(Usuario.class).list();
	}
}