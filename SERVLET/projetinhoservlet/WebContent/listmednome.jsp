<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/listmednome" var="listmednome"></c:url>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listando Nome</title>
</head>
<body>

<form method="get" action="./listmednome" >
Nome:<input type="text" name="nome"/>
<input type="submit" value="enviar"/>
</form>

</body>
</html>