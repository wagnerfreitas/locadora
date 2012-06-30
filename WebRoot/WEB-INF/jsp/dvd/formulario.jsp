<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Cadastrar DVD</title>
	</head>
	<body>
		<div>
			<form action="<c:url value='/dvds' />" method="post">
				<label>Nome: </label><input type="text" name="dvd.nome" />
				<input type="submit" value="Enviar" />
			</form>
		</div>
	</body>
</html>