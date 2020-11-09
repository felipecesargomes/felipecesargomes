<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/index.jsp" var="telainicial" ></c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrado</title>
</head>
<body>

Médico ${nome} cadastrado com sucesso!

<br/>

<a href="${telainicial}">Voltar para tela de index</a>

</body>
</html>