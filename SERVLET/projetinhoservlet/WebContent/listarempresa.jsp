<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listando Empresa</title>
</head>
<body>

<ul>
<c:forEach items="${list}" var="l">
<li>Nome: ${l.nome} - Data Abertura: <fmt:formatDate value="${l.dataAbertura}" pattern="dd/MM/yyyy"/></li>
</c:forEach>
</ul>

</body>
</html>