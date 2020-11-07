<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/index.jsp" var="voltar"></c:url>
<%@ page import="java.util.List, br.com.fabrica.model.Fabrica" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listando Fábricas</title>
</head>
<body>

<c:forEach items="${lista}" var="l">
<ul>
<li>${l.nome}</li>
</ul>
</c:forEach>


<a href="${voltar}">Voltar para index</a>

</body>
</html>