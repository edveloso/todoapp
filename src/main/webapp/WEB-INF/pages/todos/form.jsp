<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/main.css" />" >

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

   <h2>Adicionar Tarefa</h2>
   <form action="<c:url value="/todos/add" />" method="post">
      <label for="tarefa">Tarefa</label>
      <input type="text" name="tarefa" id="tarefa" size="200">
      <br/>
      
      <input type="submit" value="Salvar">
      
      
   </form>
   
</body>
</html>