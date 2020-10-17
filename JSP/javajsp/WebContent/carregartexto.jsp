<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enviar parametro para cá</title>
</head>
<body>

<%!
int i = 5;

public int retorno(int x) {
	return x*x;
}
%>

<% out.println(i); out.print(retorno(3)); %>

</body>
</html>