<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table>
	<thead>
		<tr>
			<th>Nome</th>
			<th>Alugar</th>
		</tr>
	</thead>
	<c:forEach items="${clientes}" var="cliente">
		<tr>
			<td>${cliente.nome}</td>
			<td><a href="<c:url value='/dvds/alugar/usuarios/${cliente.id}' />">Alugar</a></td>
		</tr>
	</c:forEach>
</table>