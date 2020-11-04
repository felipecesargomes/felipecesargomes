<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<c:url value="/cadastrofazenda" var="cadastrofaz" />
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrando Fazenda</title>
</head>
<body>

<h1>Cadastrando Fazenda</h1>

<form method="post" action="${cadastrofaz}" >
Nome: <input type="text" name="nome" />
Hectares: <input type="text" name="hectares" />
<input type="submit" value="Enviar" />
</form>

</body>
</html>