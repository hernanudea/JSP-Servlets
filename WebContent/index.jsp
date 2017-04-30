<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Página JSP</title>
</head>
<body>
<h1>Contenido desde HTML</h1>

<%
	String s = "Este es un mensaje no dinánico desde Java";
	out.println(s);
%>
<p>Este es un mensaje no dinánico desde HTML</p>

<%
	//En JSP el objeto request está implicito
	out.println("la siguiente linea es contenido dinamico:\n" + request.getHeader("USER-AGENT"));
%>

</body>
</html>