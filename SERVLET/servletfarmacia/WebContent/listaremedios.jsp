<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List, br.com.servletfarmacia.model.Remedio" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listando Remédios</title>
</head>
<body>

<ul>
<c:forEach items="${listaR}" var="lista">
	
	<li>${lista.nome}</li>
	
</c:forEach>
</ul>

<ul>
<li><% for(Remedio r : (List<Remedio>)request.getAttribute("listaR")) { %> <%= r.getNome() %> <% } %></li>
</ul>

</body>
</html>