package com.collegeadmission.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.collegeadmission.daoimplementation.UserDaoImpl;
import com.collegeadmission.model.UserDetails;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String username=request.getParameter("username");
		String email=request.getParameter("email");
		long mobileno=Long.parseLong(request.getParameter("mobileno"));
		String password=request.getParameter("password");
//		UserDetails user=new UserDetails(username,email,mobileno,password);
//		UserDaoImpl userdao=new UserDaoImpl();
//		user=userdao.validateUser(username,email,mobileno, password);
		PrintWriter rw=response.getWriter();
		rw.write("UserName: " +username);
		rw.write("Email:"+email);
		rw.write("Mobile Number: " + mobileno);
		rw.write("Password:"+password);
	}

}
