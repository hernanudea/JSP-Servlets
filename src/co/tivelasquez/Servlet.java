package co.tivelasquez;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new servlet.
	 *
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet() {
		super();
		// TODO Auto-generated constructor stub
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
				getServletContext().getRequestDispatcher("/jsp/login.jsp").forward(request, response);
			} else if (accion.equals("inicio")) {
				getServletContext().getRequestDispatcher("/jsp/index.jsp").forward(request, response);
			} else if (accion.equals("iniciarSeccion")) {
				getServletContext().getRequestDispatcher("/jsp/postLogin.jsp").forward(request, response);
			}
		} else {
			getServletContext().getRequestDispatcher("/jsp/index.jsp").forward(request, response);
		}
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
