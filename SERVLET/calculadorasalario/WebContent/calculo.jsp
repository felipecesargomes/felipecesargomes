<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.lang.Integer" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% double n = Double.parseDouble(request.getAttribute("calc").toString()); %>
O salário de <%= request.getParameter("salariototal") %> é equivalente à <%= n %> salarios mínimos de <%= request.getParameter("salariominimo") %>

</body>
</html>