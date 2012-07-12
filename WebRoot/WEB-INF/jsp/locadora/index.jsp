<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Locadora</title>
	</head>
	<body>
		<div>
			Bem vindo, ${usuarioLogin} - <a href="<c:url value='logout' />">sair</a>
		</div>
		<div>
			<a href="<c:url value='/usuarios' />">Usuários</a>
			<a href="<c:url value='/dvds' />">DVDs</a>
			<a href="<c:url value='/clientes' />">Clientes</a>
		</div>
	</body>
</html>