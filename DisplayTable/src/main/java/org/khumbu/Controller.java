package org.khumbu;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.model.UserModel;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String page=request.getParameter("page");
		 if(page!=null)
		 {
			 page = page.toLowerCase();
			 switch(page) {
			 case "home":
				 request.getRequestDispatcher("Home.jsp").forward(request, response);
				 break;
			 case "users":
				 UserModel userModel= new UserModel();
				 request.setAttribute("users", userModel.listUsers());
				 request.getRequestDispatcher("users.jsp").forward(request,response);
				 break;
				 default:
					 
					 
					 request.getRequestDispatcher("Error.jsp").forward(request, response);
					 break;
			 }
		 }
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
