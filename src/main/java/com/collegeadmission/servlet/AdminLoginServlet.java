package com.collegeadmission.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.collegeadmission.daoimplementation.AdminDaoImpl;
import com.collegeadmission.model.*;

/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet("/adminlogin")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("adminemail");
		System.out.println("cnvccvc"+email);
		String Password = request.getParameter("adminpassword");
		System.out.println("snvdfcgscdcghcdgdccd");
	
		AdminDaoImpl cpDao = new AdminDaoImpl();
		
		try {
			Boolean Str = cpDao.loginAdmin(email, Password);
//		HttpSession session=request.getSession();
//			session.setAttribute("Email", email);


			if(Str==true)
			{

			    response.sendRedirect("AdminView.jsp");
			   			    
			}
			else
			{
				response.sendRedirect("AdminLogin.jsp");
				
			}
		} 
		
		catch (Exception e) {			
			e.printStackTrace();
			
		}
		
	}

}

