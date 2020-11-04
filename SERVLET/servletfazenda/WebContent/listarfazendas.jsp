<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.servletfazenda.model.Fazenda" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<c:url value="/index.jsp" var="cadastrofaz" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listando Fazendas</title>
</head>
<body>

<c:forEach items="${listaF}" var="lista">
<ul>
<li>${lista.nome}</li>
</ul>
</c:forEach>

<br/>
<a href="${cadastrofaz}">Voltar para Tela Inicial</a>

</body>
</html>