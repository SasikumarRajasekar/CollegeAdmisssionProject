package com.collegeadmission.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
//		String name=request.getParameter("name");
//		String password=request.getParameter("pass");
//		
//		System.out.println(name+" "+password);
//		PrintWriter rw=response.getWriter();
//		rw.write("Name:"+name);
//		rw.write("Password:"+password);
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
	//	System.out.println(email+" "+password);
		PrintWriter rw=response.getWriter();
		rw.write("Email:"+email);
		rw.write("Password:"+password);
		
		
	}

}
