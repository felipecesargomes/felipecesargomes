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
O sal�rio de <%= request.getParameter("salariototal") %> � equivalente � <%= n %> salarios m�nimos de <%= request.getParameter("salariominimo") %>

</body>
</html>