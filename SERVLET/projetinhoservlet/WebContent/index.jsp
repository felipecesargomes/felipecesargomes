<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/cadastroempresa" var="cadempresa"></c:url>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastre sua empresa</title>
</head>
<body>

<h1>Cadastrando Empresa</h1>

<form method="post" action="${cadempresa}">
	Nome: <input type="text" name="nome" />
	Data Abertura: <input type="text" name="dataAbertura" />
	<input type="submit" value="enviar" />
</form>

</body>
</html>