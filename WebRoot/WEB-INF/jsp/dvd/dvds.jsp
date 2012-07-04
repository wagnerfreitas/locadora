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
								<button>Alugar</button>
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