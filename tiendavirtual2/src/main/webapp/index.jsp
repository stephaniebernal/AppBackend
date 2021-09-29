<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/estilo.css"/>
<meta charset="UTF-8">
<title>Pagina de ejemplo</title>
</head>

<body>
<h1>Bienvenido a Tienda Los chicos del Barrio</h1>

	<form method="get" action="validar.jsp">
		<table class="regitro">
			<tr>
				 <td><label class="regitro1" for="uname"><b>Usuario</b></label></td>
   				 <td><input class="regitro1" type="text" placeholder="Ingresa el usuario" name="uname" required></td>
			</tr>
			<tr>
				<td><label class="regitro1" for="passt"><b>Contraseña</b></label></td>
				<td><input class="regitro1" type="password" placeholder="Ingresa la contraseña" name="passt" required></td>
			</tr>

		</table>
			<div class="log">
     		 <button type="submit" class="signupbtn">Login</button>
    		</div>
	</form> 

</body>
</html>
