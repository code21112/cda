package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConducteurServlet
 */
@WebServlet("/conducteur")
public class ConducteurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConducteurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("conducteur.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Within doPost ConducteurServlet");
		String prenom = request.getParameter("prenom");
		String nom = request.getParameter("nom");

		System.out.println("Within doPost ConducteurServlet: " + prenom);
		System.out.println("Within doPost ConducteurServlet: " + nom);
		
		request.setAttribute("prenom", prenom);
		request.setAttribute("nom", nom);

		getServletContext().getRequestDispatcher("/association").forward(request,response);
		doGet(request, response);
	}

}
