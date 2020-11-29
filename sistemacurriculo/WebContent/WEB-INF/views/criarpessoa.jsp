<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var="link"></c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Criar Pessoa</title>
</head>
<body>

<form method="post" action="${link }">
	Nome do Usuário:<input type="text" name="nome" />
	Status Social:<input type="text" name="status" />
	Data Nascimento:<input type="text" name="data" />
	Nacionalidade:<input type="text" name="nacionalidade" />
	<input type="hidden" name="acao" value="CadastroPessoa" />
	<input type="submit" value="Enviar" />
	
</form>

</body>
</html>