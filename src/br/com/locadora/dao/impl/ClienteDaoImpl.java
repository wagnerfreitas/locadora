package br.com.locadora.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.ioc.Component;
import br.com.locadora.dao.ClienteDao;
import br.com.locadora.model.Cliente;

@Component
public class ClienteDaoImpl implements ClienteDao {

	private Session session;

	public ClienteDaoImpl(Session session) {
		this.session = session;
	}

	@SuppressWarnings("unchecked")
	public List<Cliente> list() {
		return session.createCriteria(Cliente.class)
				.addOrder(Order.asc("nome")).list();
	}

	public void save(Cliente cliente) {
		session.save(cliente);
	}

	@SuppressWarnings("unchecked")
	public List<Cliente> pesquisar(String nome) {
		return session.createCriteria(Cliente.class)
				.add(Restrictions.ilike("nome", "%" + nome + "%"))
				.addOrder(Order.asc("nome")).list();
	}
}