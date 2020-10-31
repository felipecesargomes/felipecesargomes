<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.testandojsp.model.Carro" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% List<Carro> carros = (List<Carro>)request.getAttribute("listaCarro");
for(Carro carro: carros) {
%>
<li><%= carro.getNome() %></li>
<% } %>

</body>
</html>