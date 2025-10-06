<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TP5 - GRUPO 11 | Agregar Cliente</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" />

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
   
    <!-- jQuery -->
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

    <!-- Font Awesome -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" rel="stylesheet" />

    <!-- Animate.css -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css" />
    
	<link rel="stylesheet" href="css/style.css">
</head>
<body>
  <div class="columnaIzquierda">
    <div class="menu">
      <h3>Menú</h3>
      <ul>
        <li><a href="NuevoCliente.jsp">Alta de Clientes</a></li>
        <li><a href="ListadoClientes.jsp">Listado de Clientes</a></li>
      </ul>
    </div>
  </div>

  <div class="contenido">
    <h2>Formulario de Cliente</h2>
    <h3><%= session.getAttribute("login") %></h3>
  </div>
</body>
</html>