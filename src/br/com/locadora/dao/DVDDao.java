package br.com.locadora.dao;

import java.util.List;

import br.com.locadora.model.DVD;

public interface DVDDao {
	public List<DVD> list();
	public void save(DVD dvd);
}