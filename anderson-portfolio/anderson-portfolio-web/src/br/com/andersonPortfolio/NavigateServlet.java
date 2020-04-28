package br.com.andersonPortfolio;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NavigateServlet
 */
@WebServlet(
	name = "navigateServlet",
	urlPatterns = {"/welcome"},
	loadOnStartup = 1
)
public class NavigateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		if(action == null)
			this.showHomepage(request, response);
		else
		{
			switch(action) {
				case "who": this.showWhoAmIPage(request, response); break;
				case "job": this.showProjectsPage(request, response); break;
				case "pho": this.showContactPage(request, response); break;
				default: this.showHomepage(request, response);
			}
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		if(action == null)
			this.showHomepage(request, response);
		
	}
	
	private void showHomepage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		request.getRequestDispatcher("/WEB-INF/jsp/view/homepage.jsp")
			   .forward(request, response);
	}
	
	private void showWhoAmIPage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		request.getRequestDispatcher("/WEB-INF/jsp/view/whoami.jsp")
			   .forward(request, response);
	}
	
	private void showProjectsPage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		request.getRequestDispatcher("/WEB-INF/jsp/view/projects.jsp")
			   .forward(request, response);
	}
	
	private void showContactPage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		request.getRequestDispatcher("/WEB-INF/jsp/view/givemeacall.jsp")
			   .forward(request, response);
	}

}
