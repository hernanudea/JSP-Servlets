<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PostLogin JSP</title>
</head>
<body>
	<h1>PostLogin.jsp</h1>

	<%
		out.println("Tu usuario es: " + request.getParameter("usuario"));
	%>

	<%-- otra forma de invocar a out.println es usando <%= %> --%>
	<%="Tu contraseña es: " + request.getParameter("contrasena")%>

</body>
</html>