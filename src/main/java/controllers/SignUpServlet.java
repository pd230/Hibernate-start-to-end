package controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import dao.UserDao;

/**
 * Servlet implementation class SignUpServlet
 */
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String fname = request.getParameter("fname");
		String sname = request.getParameter("sname");
		String email = request.getParameter("email");
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		
		UserDao ud = new UserDao();
		boolean exists = ud.RegisterUser(fname, sname, email, uname, password);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Home.jsp");
		
		if (exists) {
		    request.setAttribute("error", "Username or Password already exists!");
		    RequestDispatcher rd = request.getRequestDispatcher("SignUp.jsp");
		    rd.include(request, response);
		} else {
		    RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
		    rd.forward(request, response);
		}
		
	}

}
