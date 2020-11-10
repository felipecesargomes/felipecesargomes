<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/cadastroempresa" var="cadEmpresa"></c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar Empresa</title>
</head>
<body>

<form method="post" action="${cadEmpresa}">
Nome:<input type="text" name="nome"/>
Data Abertura:<input type="text" name="data"/>
<input type="submit" value="Enviar"/>
</form>

</body>
</html>