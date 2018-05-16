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
 * Servlet implementation class EditarEquipoServlet
 */
@WebServlet("/EditarEquipoServlet")
public class EditarEquipoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarEquipoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        System.out.println("hola");
		Controlador c = new Controlador();
		int id = Integer.parseInt(request.getParameter("id"));
		EquipoDao d = new EquipoDao();
		Equipo eq = d.find(id);
		System.out.println(eq.getNombre() + eq.getPresidente());
		request.setAttribute("equipo",eq);
		RequestDispatcher rd = request.getRequestDispatcher("views/editequipo.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
