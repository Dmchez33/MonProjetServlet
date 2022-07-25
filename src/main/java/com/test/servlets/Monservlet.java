package com.test.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.bean.Utilisateur;
import com.test.BDD.Identify;

/**
 * Servlet implementation class Monservlet
 */
@WebServlet("/Monservlet")
public class Monservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Monservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Identify tabUser = new Identify();
		request.setAttribute("utitlisateurs", tabUser.recupererUtilisateurs());
		//this.getServletContext().getRequestDispatcher("MonServletJspInscrire.jsp").forward(request, response);
		this.getServletContext().getRequestDispatcher("/WEB-INF/Accueil.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom(request.getParameter("nom"));
        utilisateur.setPrenom(request.getParameter("prenom"));
        utilisateur.setEmail(request.getParameter("email"));
        utilisateur.setMot_de_passe(request.getParameter("passe"));
        utilisateur.setRepete_mot_de_passe(request.getParameter("repeat-pass"));
        
        Identify tabUser = new Identify();
        
        tabUser.ajouterUtilisateur(utilisateur);
        request.setAttribute("utilisateurs", tabUser.recupererUtilisateurs());
        
        //this.getServletContext().getRequestDispatcher("MonServletJsp/Inscrire.jsp").forward(request, response);
        this.getServletContext().getRequestDispatcher("/WEB-INF/Accueil.jsp").include(request, response);
        
	}

}
