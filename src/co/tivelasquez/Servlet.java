package co.tivelasquez;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet
 */
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String rutaJsp;

	/**
	 * Instantiates a new servlet.
	 *
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	// este metodo se ejecuta solo una vez y es heredado desde la superclase
	// con config.getInitParameter() invoca el parametro inicial

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		rutaJsp = config.getInitParameter("rutaJSP");
		System.out.println(rutaJsp);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// creeamos un parametro Get llamado accion
		String accion = request.getParameter("accion");

		if (accion != null) {
			if (accion.equals("login")) {
				setRespuestaControlador(accion).forward(request, response);
				// getServletContext().getRequestDispatcher(rutaJsp +
				// "login.jsp").forward(request, response);
			} else if (accion.equals("inicio")) {
				setRespuestaControlador("inicio").forward(request, response);
				// getServletContext().getRequestDispatcher(rutaJsp +
				// "index.jsp").forward(request, response);
			} else if (accion.equals("iniciarSeccion")) {
				setRespuestaControlador("inicio").forward(request, response);
				// getServletContext().getRequestDispatcher(rutaJsp +
				// "postLogin.jsp").forward(request, response);
			}
		} else {
			getServletContext().getRequestDispatcher(rutaJsp + "index.jsp").forward(request, response);
		}
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
	}

	/**
	 * Metodo para mejorar la entrega de las vistas
	 */
	public RequestDispatcher setRespuestaControlador(String vista) {
		String url = rutaJsp + vista + ".jsp";
		return getServletContext().getRequestDispatcher(url);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String accion = request.getParameter("accion");

		if (accion != null) {
			if (accion.equals("iniciarSeccion")) {
				String usuario = request.getParameter("usuario");
				String contrsena = request.getParameter("contrasena");

				/*
				 * Existen tres formas de comunicar una vista con un servlet:
				 * request. sesion. context.
				 */

				// Ambito request: solo una petición
				request.setAttribute("usuario", usuario);
				request.setAttribute("contrasena", contrsena);

				// Ambito Sesión. va a existir mientras no se destrulla con una
				// linea de codigo o el cierra de la ventana del navegador
				HttpSession sesion = request.getSession();
				sesion.setAttribute("usuario", usuario);
				sesion.setAttribute("contrasena", contrsena);

				// Ambito del Contexto. Existe mientras el Servlet no ejecute un
				// metodo llamado distroy
				ServletContext contexto = getServletContext();
				contexto.setAttribute("usuario", usuario);
				contexto.setAttribute("contrasena", contrsena);

				setRespuestaControlador("postLogin").forward(request, response);
				// getServletContext().getRequestDispatcher(rutaJsp +
				// "postLogin.jsp").forward(request, response);
			}
		} else {
			setRespuestaControlador("inicio").forward(request, response);
			// getServletContext().getRequestDispatcher(rutaJsp +
			// "index.jsp").forward(request, response);
		}
	}

}
