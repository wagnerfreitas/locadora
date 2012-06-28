package br.com.locadora.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

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
		return session.createCriteria(Usuario.class).addOrder(Order.asc("login")).list();
	}
	
	public void save( Usuario usuario ) {
		session.save(usuario);
	}
	
	public Usuario login(String login, String senha) {
		Criteria criteria = session.createCriteria(Usuario.class);
			criteria.add(Restrictions.eq("login", login));
			criteria.add(Restrictions.eq("senha", senha));
		return (Usuario) criteria.uniqueResult();
	}
}