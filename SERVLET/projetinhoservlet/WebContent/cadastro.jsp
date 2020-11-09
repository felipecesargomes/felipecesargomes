<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/cadastromedico" var="cadmed"></c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar Médico</title>
</head>
<body>

<form method="post" action="${cadmed}">
	Nome: <input type="text" name="nome"/>
	Idade: <input type="text" name="idade"/>
	<input type="submit" value="Enviar"/>
</form>

</body>
</html>