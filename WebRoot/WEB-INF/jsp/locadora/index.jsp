<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Locadora</title>
	</head>
	<body>
		<div>
			Bem vindo, ${usuarioLogin} - <a href="<c:url value='logout' />">Sair</a>
		</div>
		<div>
			<a href="<c:url value='/usuarios' />">Usuários</a>
		</div>
	</body>
</html>