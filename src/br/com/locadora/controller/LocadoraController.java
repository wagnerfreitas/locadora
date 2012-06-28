package br.com.locadora.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class LocadoraController {
	
	private Result result;
	
	public LocadoraController( Result result ) {
		this.result = result;
	}
	
	@Get("/")
	public void index() {
		
	}
}