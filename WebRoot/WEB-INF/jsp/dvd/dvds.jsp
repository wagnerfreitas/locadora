<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<title>DVDs</title>
		<script src="<c:url value='/js/jquery-1.7.2.min.js' />"></script>
		<script src="<c:url value='/js/locadora.js' />"></script>
		<script src="<c:url value='/js/dvd.js' />"></script>
	</head>
	<body>
		<div>
			<a href="<c:url value='/' />">Home</a>
		</div>
		<div>
			<form id="formAlugarOuDevolverDVD" action="<c:url value='/dvds/?/' />" method="post"></form>
			<table>
				<thead>
					<tr>
						<th>Nome</th>
						<th>Locado</th>
					</tr>
				</thead>
				<c:forEach items="${dvds}" var="dvd">
					<tr>
						<td>${dvd.nome}</td>
						<td>
							<c:if test="${!dvd.alugado}">
								<button type="button" onclick="locadora.views.dvd.alugar(${dvd.id})">Alugar</button>
							</c:if>
							<c:if test="${dvd.alugado}">
								<button type="button" onclick="locadora.views.dvd.devolver(${dvd.id})">Devolver</button>
							</c:if>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<div>
			<a href="<c:url value='/dvds/new' />">Novo DVD</a>
		</div>
	</body>
</html>