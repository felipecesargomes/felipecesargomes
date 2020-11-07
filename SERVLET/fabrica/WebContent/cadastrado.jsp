<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/cadastrar.jsp" var="opcao1"></c:url>
<c:url value="/listarfabricas" var="opcao2" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrado</title>
</head>
<body>Fábrica ${nome} cadastrado com sucesso

<a href="${opcao1}">1. Cadastrar Fábrica</a>
<a href="${opcao2}">2. Listar Fábrica</a>

</body>
</html>