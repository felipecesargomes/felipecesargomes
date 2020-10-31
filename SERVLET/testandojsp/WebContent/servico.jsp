<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% String carro = (String) request.getAttribute("carro"); %>

<%= carro %> cadastrado com sucesso!

<a href="./listarcarros">Listar Carros</a>

</body>
</html>