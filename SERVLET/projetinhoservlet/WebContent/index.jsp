<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/cadastroempresa" var="cademp"></c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrando Empresa</title>
</head>
<body>

<form method="post" action="${cademp}">
	Nome: <input type="text" name="nome" />
	Id: <input type="text" name="id" />
	<input type="submit" value="Enviar" />
</form>


</body>
</html>