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
			// List<Cliente> clientes = cn.obtenerTodos(); // TODO: implementar el metodo cn.obtenerTodos();
			// request.setAttribute("clientes", clientes);
			
			RequestDispatcher rd = request.getRequestDispatcher("/ListadoClientes.jsp");
			rd.forward(request, response);
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	}

}
