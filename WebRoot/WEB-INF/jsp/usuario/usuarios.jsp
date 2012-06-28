<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Usuários</title>
	</head>
	<body>
		<div>
			<a href="<c:url value='/' />">Home</a>
		</div>
		<div>
			<c:forEach items="${usuarios}" var="usuario">
				Login: ${usuario.login} <br>
			</c:forEach>
		</div>
		<div>
			<a href="<c:url value='/usuarios/new' />">Novo usuário</a>
		</div>
	</body>
</html>