package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Controlador;

/**
 * Servlet implementation class JugadorServlet
 */
@WebServlet("/JugadorServlet")
public class JugadorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JugadorServlet() {
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
		// TODO Auto-generated method stub
		Controlador c = new Controlador();
		int equipo = Integer.parseInt(request.getParameter("equipo"));
		int numero = Integer.parseInt(request.getParameter("numero"));
		String nombre = request.getParameter("nombre");
		String email = request.getParameter("email");
		String posicion = request.getParameter("posicion");
		String f =  request.getParameter("fecha");
		
		 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			
		 Date fecha=null;
		try {
			fecha = formatter.parse(f);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 c.registrarJugador(equipo, numero, email, fecha, nombre, posicion);

		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
		
		
	}

}
