package presentacion.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidad.Usuario;
import negocio.UsuarioNeg;
import negocioImpl.UsuarioNegImpl;


@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletLogin() {
		super();

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
		if( request.getParameter("Param").matches("logout") )
		{
			request.getSession().removeAttribute("username");
			RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
			rd.forward(request, response);
		}

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

		UsuarioNeg usuarioNeg = new UsuarioNegImpl();

		if (request.getParameter("btnLogin") != null) {
			String username = request.getParameter("txtUsername").toString();
			String password = request.getParameter("txtPassword").toString();

			// Armamos el objeto Usuario
			Usuario user = new Usuario(username, password);
			boolean result = usuarioNeg.verificarUsuario(user);

			if (result) {
				// Creamos la variable Session
				request.getSession().setAttribute("login", username);
				RequestDispatcher dispatcher = request.getRequestDispatcher("/NuevoCliente.jsp");
				dispatcher.forward(request, response);

			} else {
				request.setAttribute("message", result);
				RequestDispatcher dispatcher = request.getRequestDispatcher("/Login.jsp");
				dispatcher.forward(request, response);

			}
		}

	}

}
