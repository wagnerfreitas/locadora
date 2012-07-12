package br.com.locadora.dao;

import java.util.List;

import br.com.locadora.model.Cliente;

public interface ClienteDao {

	public List<Cliente> list();

	public void save(Cliente cliente);

	public List<Cliente> pesquisar(String nome);
}