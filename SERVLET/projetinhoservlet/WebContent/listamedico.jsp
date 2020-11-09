<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/index.jsp" var="telainicial"></c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listando Médicos</title>
</head>
<body>
 <ul>
 
<c:forEach items="${list}" var="l">

 <li>${l.nome}</li>

</c:forEach>

 </ul>
 
 <a href="${telainicial}">Voltar para Tela Inicial</a>
 
</body>
</html>