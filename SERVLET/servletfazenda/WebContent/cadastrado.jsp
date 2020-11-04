<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<c:url value="/cadastrarfazenda.jsp" var="cadastrofaz" />
<c:url value="/listarfazendas" var="listarfaz" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrado com sucesso!</title>
</head>
<body>

Fazenda ${nome} cadastrada com sucesso! <br/>

<a href="${cadastrofaz}">Cadastro Fazenda</a>
<a href="${listarfaz}">Listar Fazendas</a>

</body>
</html>