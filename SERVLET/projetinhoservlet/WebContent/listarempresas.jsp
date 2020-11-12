<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value=""></c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresas Listadas</title>
</head>
<body>

<c:if test="${not empty nome}">Empresa ${nome} cadastrada com sucesso!</c:if>

<ul>
<c:forEach items="${list}" var="l">
	<li>Nome: ${l.nome} - Data Abertura: <fmt:formatDate pattern="dd/MM/yyyy" type="date" value="${l.dataAbertura}" /></li>
</c:forEach>
</ul>

</body>
</html>