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
    
    
   <form action="ServletCliente" method="post">
   <div class="fila">
     <div class="columna">
       <label for="dni">DNI <span>*</span></label>
       <input type="text" id="dni" name="dni" required pattern="\d{6,8}">
       <small>Solo numeros. 6 a 8 digitos (ej:12345678).</small>
     </div>
     <div class="columna">
       <label for="cuil">CUIL <span>*</span></label>
       <input type="text" id="cuil" name="cuil" required pattern="\d{11}">
       <small>Formato 11 digitos (ej:20333445556)</small>
     </div>
   </div>

   <div class="fila">
     <div class="columna">
       <label for="nombre">Nombre <span>*</span></label>
       <input type="text" id="nombre" name="nombre" required pattern="[A-Za-zÁÉÍÓÚáéíóúÑñ\s]+">
     </div>
     <div class="columna">
       <label for="apellido">Apellido <span>*</span></label>
       <input type="text" id="apellido" name="apellido" required pattern="[A-Za-zÁÉÍÓÚáéíóúÑñ\s]+">
     </div>
   </div>

   <div class="fila">
     <div class="columna">
       <label for="sexo">Sexo <span>*</span></label>
       <select id="sexo" name="sexo" required>
         <option value="">Seleccione</option>
         <option value="M">Masculino</option>
         <option value="F">Femenino</option>
         <option value="Otro">Otro</option>
       </select>
     </div>
     <div class="columna">
       <label for="nacionalidad">Nacionalidad</label>
       <input type="text" id="nacionalidad" name="nacionalidad" pattern="[A-Za-zÁÉÍÓÚáéíóúÑñ\s]+">
     </div>
   </div>

   <div class="fila">
     <div class="columna">
       <label for="fechaNacimiento">Fecha de nacimiento <span>*</span></label>
       <input type="date" id="fechaNacimiento" name="fechaNacimiento" required>
     </div>
     <div class="columna">
       <label for="direccion">Dirección</label>
       <input type="text" id="direccion" name="direccion">
     </div>
   </div>

   <div class="fila">
     <div class="columna">
       <label for="localidad">Localidad</label>
       <input type="text" id="localidad" name="localidad" pattern="[A-Za-zÁÉÍÓÚáéíóúÑñ\s]+">
     </div>
     <div class="columna">
       <label for="provincia">Provincia</label>
       <input type="text" id="provincia" name="provincia" pattern="[A-Za-zÁÉÍÓÚáéíóúÑñ\s]+">
     </div>
   </div>

   <div class="fila">
     <div class="columna">
       <label for="email">Correo electrónico <span>*</span></label>
       <input type="email" id="email" name="email">
       <small>Ej: nombre@dominio.com</small>
     </div>
     <div class="columna">
       <label for="telefono">Teléfono</label>
       <input type="text" id="telefono" name="telefono" pattern="\d{10}" maxlength="10">
     </div>
   </div>

   <div style="text-align: left; margin-top: 30px;">
     <button type="submit">Guardar Cliente</button>
   </div>
   
  </form>
    
  </div>
</body>
</html>