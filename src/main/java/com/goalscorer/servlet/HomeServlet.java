package com.goalscorer.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import com.goalscorer.Util.MatchContainer;

/**
 * Servlet implementation class HomeServlet
 */
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<MatchContainer> matchList=new ArrayList<>();
		for (int i = 0; i < 12; i++) {
		    MatchContainer container = new MatchContainer();
		    container.setStatus("Live");
		    container.setTeam1("RM");
		    container.setTeam2("BRA");
		    container.setT1Score(4);
		    container.setT2Score(2);
		    container.setTime("78'");
		    container.setTournament("La Liga");
		    matchList.add(container);
		    
		}

		request.setAttribute("matchList", matchList);
		
//		response.sendRedirect("home.jsp");
		RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
		dispatcher.forward(request, response);
	}

	

}
