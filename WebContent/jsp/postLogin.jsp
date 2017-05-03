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

	<br>
	<h2>Request</h2>
	<%="Usuario: " + request.getAttribute("usuario") + ", Contraseña: "
					+ request.getAttribute("contrasena")%>

	<br>
	<h2>Sesion</h2>
	<%="Usuario: " + session.getAttribute("usuario") + ", Contraseña: "
					+ session.getAttribute("contrasena")%>

	<br>
	<h2>Context</h2>
	<%="Usuario: " + application.getAttribute("usuario") + ", Contraseña: "
					+ application.getAttribute("contrasena")%>

	<p>
		<a href="?accion=inicio">Regresar a inicio</a>
	</p>

</body>
</html>