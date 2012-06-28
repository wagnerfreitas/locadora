<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Login</title>
	</head>
	<body>
		<div>
			<div>${mensagem}</div>
			<form action="<c:url value='/login' />" method="post">
				<label>Login: </label><input type="text" name="login" />
				<label>Senha: </label><input type="password" name="senha" />
				<input type="submit" value="Enviar" />
			</form>
		</div>
	</body>
</html>