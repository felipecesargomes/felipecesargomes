<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<<c:url value="/fabricaservlet" var="fabr"></c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrando</title>
</head>
<body>

<form method="post" action="${fabr}">
	Nome: <input type="text"  name="nome" />
	Localização: <input type="text" name="local" />
	<input type="submit" value="Cadastrar" />
</form>

</body>
</html>