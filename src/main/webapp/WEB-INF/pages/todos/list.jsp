<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/main.css" />" >

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Page List Todo
	<table>
		<tr>
			<th>Tarefa</th>
			<th>Status</th>
			<th>Ação</th>
		</tr>

		<c:forEach var="todo" items="${listaTodos}" varStatus="loop">
			<tr>
				<td>${todo.tarefa}</td>
				<td>${todo.pronto}</td>
				<td><a href="<c:url value="/todos/edit/${loop.index}" />" >Edit</a></td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>