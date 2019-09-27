<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/main.css" />" >

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">


<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	
	<div class="container">
	<h2>Page List Todo</h2>
	<h3><a href="<c:url value="/todos/form" />"  >Criar nova tarefa</a></h3>
	
	<table class="table" >
	<thead class="thead-dark">
		<tr>
			<th>Tarefa</th>
			<th>Status</th>
			<th>Ação</th>
		</tr>
		</thead>

<tbody>
		<c:forEach var="todo" items="${listaTodos}" >
			<tr>
				<td>${todo.tarefa}</td>
				<td>${todo.pronto}</td>
	<td>
	
	<a href="<c:url value="/todos/edit/${todo.id}" />" >Edit</a>
	|
	<a href="<c:url value="/todos/edit/${todo.id}" />" >Delete</a>
	
	
	</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</div>


	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
		integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
		crossorigin="anonymous"></script>

</body>
</html>