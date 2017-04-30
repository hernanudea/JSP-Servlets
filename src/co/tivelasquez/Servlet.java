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
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		PrintWriter out =  response.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html lang='es'>");
		out.print("<head>");
		out.print("<meta charset='UTF-8'>");
		out.print("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		out.print("<meta http-equiv='X-UA-Compatible' content='ie=edge'>");
		out.println("<title>Aprendiendo Servlets</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hola mundo desde Servlet!!!</h1>");
		out.println("<h2>By Hern&aacute;n Velásquez</h2>");
		out.println("</body>");
		out.println("</html>");
		*/
		
		String accion = request.getParameter("accion");
		
		if (accion != null) {
			
		}else{
			getServletContext().getRequestDispatcher("/index.html").forward(request, response);
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
