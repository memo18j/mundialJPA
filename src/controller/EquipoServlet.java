package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Equipo;
import model.EquipoDao;
import util.Controlador;

/**
 * Servlet implementation class EquipoServlet
 */
@WebServlet("/EquipoServlet")
public class EquipoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EquipoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EquipoDao d = new EquipoDao();
		Equipo eq = new Equipo();
		Controlador c = new Controlador();
		String nombre = request.getParameter("nombre");
		String presidente = request.getParameter("presidente");
		System.out.println("n: " + nombre);
		System.out.println("p: " + presidente);
//		c.registrarEquipo(nombre, presidente);
		eq.setNombre(nombre);
		eq.setPresidente(presidente);
		d.insert(eq);
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

}
