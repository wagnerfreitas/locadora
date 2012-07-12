package br.com.locadora.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.locadora.dao.ClienteDao;
import br.com.locadora.model.Cliente;

@Resource
@Path("/clientes")
public class ClienteController {

	private Result result;
	private ClienteDao clienteDao;

	public ClienteController(Result result, ClienteDao clienteDao) {
		this.result = result;
		this.clienteDao = clienteDao;
	}

	@Get("")
	public void clientes() {}
	
	@Get("/pesquisar/{nome}")
	public void pesquisar(String nome) {
		result.include("clientes", clienteDao.pesquisar(nome));
	}

	@Get("/new")
	public void formulario() {}

	@Post("")
	public void save(Cliente cliente) {
		clienteDao.save(cliente);
		result.redirectTo(this).clientes();
	}
}