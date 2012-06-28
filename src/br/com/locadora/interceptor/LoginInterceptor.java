package br.com.locadora.interceptor;

import java.util.Arrays;

import br.com.caelum.vraptor.InterceptionException;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import br.com.caelum.vraptor.resource.ResourceMethod;
import br.com.locadora.controller.LoginController;
import br.com.locadora.dao.UsuarioSession;

@Intercepts
public class LoginInterceptor implements Interceptor {
	
	private Result result;
	private UsuarioSession usuarioSession;
	
	public LoginInterceptor( Result result, UsuarioSession usuarioSession ) {
		this.result = result;
		this.usuarioSession = usuarioSession;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean accepts(ResourceMethod method) {
		return !Arrays.asList(LoginController.class).contains(method.getMethod().getDeclaredAnnotations());
	}

	@Override
	public void intercept(InterceptorStack stack, ResourceMethod method, Object object) throws InterceptionException {
		boolean isUsuarioLogado = ( usuarioSession.getUsuario() != null );
		boolean isQuerAcessarLogin = method.getResource().getType().equals(LoginController.class);

		if( !isUsuarioLogado && !isQuerAcessarLogin )
			result.redirectTo(LoginController.class).login();
		else {
			if( usuarioSession.getUsuario() != null ) {
				result.include("usuarioLogin", usuarioSession.getUsuario().getLogin());
			}
			stack.next(method, object);
		}
	}
}