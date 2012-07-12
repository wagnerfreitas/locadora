<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Clientes</title>
		<script src="<c:url value='/js/jquery-1.7.2.min.js' />"></script>
		<script src="<c:url value='/js/locadora.js' />"></script>
		<script src="<c:url value='/js/cliente.js' />"></script>
	</head>
	<body>
		<div>
			<a href="<c:url value='/' />">Home</a>
		</div>
		<div>
			<table>
				<tr>
					<td>Nome: </td><td><input type="text" id="usuario-nome" /></td>
				</tr>
				<tr><td><button type="button" onclick="locadora.views.cliente.pesquisar();">Pesquisar</button></td></tr>
			</table>
		</div>
		<div id="list-clientes"></div>
		<div>
			<a href="<c:url value='/clientes/new' />">Novo Cliente</a>
		</div>
	</body>
</html>