<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/cadastro.jsp" var="cadmed"></c:url>
<c:url value="/listarmedico" var="listmed"></c:url>
<c:url value="/listmednome.jsp" var="listmednome"/>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de M�dico</title>
</head>
<body>

<a href="${cadmed}">Cadastrar M�dico</a><br/>
<a href="${listmed}">Listar M�dicos</a><br/>
<a href="${listmednome}">Listar M�dico por Nome</a><br/>

</body>
</html>