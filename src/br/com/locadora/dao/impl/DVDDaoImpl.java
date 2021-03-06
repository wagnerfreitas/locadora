package br.com.locadora.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Order;

import br.com.caelum.vraptor.ioc.Component;
import br.com.locadora.dao.DVDDao;
import br.com.locadora.model.DVD;

@Component
public class DVDDaoImpl implements DVDDao {

	private Session session;

	public DVDDaoImpl(Session session) {
		this.session = session;
	}

	@SuppressWarnings("unchecked")
	public List<DVD> list() {
		return session.createCriteria(DVD.class).addOrder(Order.asc("nome")).list();
	}

	public void save(DVD dvd) {
		session.save(dvd);
	}

	public void update(DVD dvd) {
		session.update(dvd);
	}

	public DVD load(Long id) {
		return (DVD) session.load(DVD.class, id);
	}
}