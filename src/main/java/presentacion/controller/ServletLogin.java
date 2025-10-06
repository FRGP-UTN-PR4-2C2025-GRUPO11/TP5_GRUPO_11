package presentacion.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entidad.Usuario;
import negocioImpl.UsuarioNegImpl;

@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletLogin() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

		UsuarioNegImpl usuarioNeg = new UsuarioNegImpl();

		if (request.getParameter("btnLogin") != null) {
			String username = request.getParameter("txtUsername").toString();
			String password = request.getParameter("txtPassword").toString();

			// Aramamos el obejto Usuario
			Usuario user = new Usuario(username, password);
			boolean result = usuarioNeg.verificarUsuario(user);

			if (result) {
				// Creamos la variable Session
				request.getSession().setAttribute("login", username);
				response.sendRedirect("ServletCliente");
				RequestDispatcher dispatcher = request.getRequestDispatcher("/NuevoCliente.jsp");
				dispatcher.forward(request, response);

			} else {
				String message = "Error, Usuario no valido";
				request.setAttribute("message", message);
				RequestDispatcher dispatcher = request.getRequestDispatcher("/Login.jsp");
				dispatcher.forward(request, response);

			}
		}
		
	}

}
