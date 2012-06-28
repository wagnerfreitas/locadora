package br.com.locadora.controller;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class LoginController {

	private Result result;
	
	public LoginController( Result result ) {
		this.result = result;
	}	
}