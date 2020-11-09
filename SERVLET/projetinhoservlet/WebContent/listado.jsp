<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, projetinhoservlet.model.Medico" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/index.jsp" var="inicio"></c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado Medico por Nome</title>
</head>

<body>

<c:forEach items="${list}" var="list">
 <li>${list.nome}</li>
teste
</c:forEach>

<br/>
<a href="${inicio}">Inicio</a>
</body>

</html>