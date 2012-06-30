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
			<c:forEach items="${dvds}" var="dvd">
				Nome: ${dvd.nome} <br>
			</c:forEach>
		</div>
		<div>
			<a href="<c:url value='/dvds/new' />">Novo DVD</a>
		</div>
	</body>
</html>