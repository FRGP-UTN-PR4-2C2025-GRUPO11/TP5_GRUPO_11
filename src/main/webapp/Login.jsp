<%@page import="entidad.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TP5 - GRUPO 11 | Bienvenido</title>
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet" />

<!-- Bootstrap JS -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

<!-- jQuery -->
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

<!-- Font Awesome -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css"
	rel="stylesheet" />

<!-- Animate.css -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css" />

<style type="text/css">
	<jsp:include page="css\style.css"></jsp:include>
</style>
</head>
<body>
	<form method="POST" action="ServletCliente">
		<div
			class="container d-flex justify-content-center align-items-center"
			style="height: 70vh;">
			<div class="card shadow p-4" style="width: 100%; max-width: 400px;">
				<div class="mb-3 text-center">

					<div class="img-hover">
						<img id="imgPerfilUrl" class="imagenPerfil" src="" /> <img
							class="hover imagenPerfil" src="" />
					</div>

				</div>
				<h3 class="text-center mb-4">Iniciar sesión</h3>

				<div class="mb-3">
					<label for="txtUsername"
						class="form-label animate__animated animate__fadeInRight">Usuario</label>
					<input type="text" name="txtUsername" class="form-control" />
				</div>

				<div class="mb-3">
					<label for="txtPassword"
						class="form-label animate__animated animate__animated animate__fadeInRight">Contraseña</label>
					<input type="password" name="txtPassword" class="form-control" />
				</div>

				<input type="submit" name="btnLogin"
					class="btn btn-primary w-100 btn-ingreso" value="Ingresar" />
			</div>
		</div>
	</form>

</body>
</html>