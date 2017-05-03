<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login con JSP</title>
</head>
<body>
	<h1>Login.jsp</h1>

	<a href="?accion=inicio">Regresar</a>


	<form method="post" action="?accion=iniciarSeccion">
		<table>
			<tr>
				<td>Nombre de Usuario</td>
				<td><input type="text" name="usuario" placeholder="Tu nombre de usuario"></td>
			</tr>
			<tr>
				<td>Contraseña</td>
				<td><input type="password" name="contrasena" placeholder="Tu contraseña"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Iniciar Sección"></td>
			</tr>
		</table>
	</form>


</body>
</html>