package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Conducteur;

/**
 * Servlet implementation class AssociationServlet
 */
@WebServlet("/association")
public class AssociationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AssociationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());

		String prenomFromConducteurServlet = (String) request.getAttribute("prenom");
		String nomFromConducteurServlet = (String) request.getAttribute("nom");

		System.out.println("Within doGet AssociationServlet: " + prenomFromConducteurServlet);
		System.out.println("Within doGet AssociationServlet: " + nomFromConducteurServlet);

//		request.setAttribute("prenom", prenomFromConducteurServlet);
//		request.setAttribute("nom", nomFromConducteurServlet);

		Conducteur nouveauConducteur = new Conducteur(prenomFromConducteurServlet, nomFromConducteurServlet);
		ArrayList listeConducteurs = new ArrayList<Conducteur>();
		listeConducteurs.add(nouveauConducteur);
		
		System.out.println("Within doGet AssociationServlet, listeConducteurs: " + listeConducteurs);

		
		request.getRequestDispatcher("association.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println("Within doPost AssociationServlet");
		String prenom = request.getParameter("prenom");
		String nom = request.getParameter("nom");

		System.out.println("Within doPost AssociationServlet: " + prenom);
		System.out.println("Within doPost AssociationServlet: " + nom);
		doGet(request, response);
	}

}
