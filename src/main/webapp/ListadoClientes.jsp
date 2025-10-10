<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="entidad.Cliente"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TP5 - PERSONAL | Listado de Clientes</title>
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
	
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.css">
<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js"></script>	
	
	
<script type="text/javascript">
$(document).ready( function() {
	$('#tblListadoClientes').DataTable();
});
</script>
<style type="text/css">
	<jsp:include page="css\style.css"></jsp:include>
</style>
</head>
<body>
	  <div class="columnaIzquierda">
	    <div class="menu">
	      <h3>Menú</h3>
	      <ul>
	        <li><a href="NuevoCliente.jsp">Alta de Clientes</a></li>
	        <li><a href="ServletCliente?Param=listadoclientes">Listado de Clientes</a></li>
	        <li><a href="ServletLogin?Param=logout">Cerrar sesión</a></li>
	      </ul>
	    </div>
	  </div>
  <div class="contenido">
			<h1>Listado de Clientes</h1>
			<div>
				Usuario:
				<%=session.getAttribute("login") %></div>

			<div>
			<table id="tblListadoClientes" class="table table-striped">
				<thead >
					<tr>
						<th>DNI</th>
						<th>CUIL</th>
						<th>Nombre y Apellido</th>
						<th>Sexo</th>
						<th>Fecha de nacimiento</th>
						<th>Dirección</th>
						<th>Nacionalidad</th>
						<th>Localidad</th>
						<th>Provincia</th>
						<th>Email</th>
						<th>Telefono</th>
					</tr>
				</thead>
				
				
				<% 
				List<Cliente> clientes = (List<Cliente>) request.getAttribute("clientes");
				
				for(Cliente cliente : clientes)
				{ %>
				<tr>
					<td><%= cliente.getDni() %></td>
					<td><%= cliente.getCuil() %></td>
					<td><%= cliente.getNombre() %> <%= cliente.getApellido() %></td>
					<td><%= cliente.getSexo() %></td>
					<td><%= cliente.getFecha_nacimiento() %></td>
					<td><%= cliente.getDireccion() %></td>
					<td><%= cliente.getNacionalidad() %></td>
					<td><%= cliente.getLocalidad() %></td>
					<td><%= cliente.getProvincia() %></td>
					<td><%= cliente.getCorreo_electronico() %></td>
					<td><%= cliente.getTelefono() %></td>
				</tr>
				<%
				}
				%>
			</table>
			</div>
	</div>
</body>
</html>