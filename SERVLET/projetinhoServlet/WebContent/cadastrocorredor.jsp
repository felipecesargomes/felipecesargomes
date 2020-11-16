<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/cadastrocorredor" var="cadc"></c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrando corredor</title>
</head>
<body>

<form method="post" action="${cadc }">
	Nome: <input type="text" name="nome" />
	Distância: <input type="text" name="distancia" />
	<input type="submit" value="Enviar" />
</form>

</body>
</html>