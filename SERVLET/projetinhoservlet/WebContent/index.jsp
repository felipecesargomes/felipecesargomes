<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/cadastro.jsp" var="cadastroempresa"></c:url>
<c:url value="/listarempresa" var="listaremp"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
</head>
<body>

<a href="${cadastroempresa}">Cadastrar Empresa</a>
<a href="${listaremp}">Listar Empresa</a>

</body>
</html>