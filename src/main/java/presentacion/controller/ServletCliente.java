package presentacion.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidad.Cliente;
import negocio.ClienteNeg;
import negocioImpl.ClienteNegImpl;



@WebServlet("/ServletCliente")
public class ServletCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletCliente() {
		super();

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

		if ( request.getParameter("Param").matches("listadoclientes") )
		{
			ClienteNeg cn = new ClienteNegImpl();
			 List<Cliente> clientes = cn.ObtenerTodos();
			 request.setAttribute("clientes", clientes);
			
			RequestDispatcher rd = request.getRequestDispatcher("/ListadoClientes.jsp");
			rd.forward(request, response);
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

		if(request.getParameter("submitNuevoCliente") != null) {
			Cliente cl = new Cliente();
			ClienteNeg cn = new ClienteNegImpl();
			
			cl.setDni(request.getParameter("dni"));
			cl.setCuil(request.getParameter("cuil"));
			cl.setNombre(request.getParameter("nombre"));
			cl.setApellido(request.getParameter("apellido"));
			cl.setSexo(request.getParameter("sexo"));
			cl.setNacionalidad(request.getParameter("nacionalidad"));
			cl.setFecha_nacimiento(request.getParameter("fechaNacimiento"));
			cl.setDireccion(request.getParameter("direccion"));
			cl.setLocalidad(request.getParameter("localidad"));
			cl.setProvincia(request.getParameter("provincia"));
			cl.setCorreo_electronico(request.getParameter("email"));
			cl.setTelefono(request.getParameter("telefono"));
			
			if (!cl.getDni().matches("\\d{6,8}")) {
	            request.setAttribute("error", "El DNI debe tener entre 6 y 8 dígitos numéricos.");
	            RequestDispatcher rd = request.getRequestDispatcher("/NuevoCliente.jsp");
	            rd.forward(request, response);
	            return;
	        }

	        if (!cl.getTelefono().matches("\\d{0,7}$")) {
	            request.setAttribute("error", "El teléfono debe tener mínimo 7 dígitos.");
	            RequestDispatcher rd = request.getRequestDispatcher("/NuevoCliente.jsp");
	            rd.forward(request, response);
	            return;
	        }

	        if (!cl.getNombre().matches("[A-Za-zÁÉÍÓÚáéíóúÑñ\\s]+")) {
	            request.setAttribute("error", "El nombre sólo puede contener letras y espacios.");
	            RequestDispatcher rd = request.getRequestDispatcher("/NuevoCliente.jsp");
	            rd.forward(request, response);
	            return;
	        }
			
			int filas = cn.agregarUno(cl);
			request.setAttribute("resultadoNuevoCliente", filas);
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/NuevoCliente.jsp");
		rd.forward(request, response);
	}

}
