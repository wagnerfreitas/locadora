package br.com.locadora.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.locadora.dao.DVDDao;
import br.com.locadora.model.DVD;

@Resource @Path("/dvds")
public class DvdController {

	private Result result;
	private DVDDao dvdDao;

	public DvdController(Result result, DVDDao dvdDao) {
		this.result = result;
		this.dvdDao = dvdDao;
	}

	@Get("")
	public void dvds() {
		result.include("dvds", dvdDao.list());
	}

	@Get("/new")
	public void formulario() {}

	@Post("")
	public void save(DVD dvd) {
		dvdDao.save(dvd);
		result.redirectTo(this).dvds();
	}
}