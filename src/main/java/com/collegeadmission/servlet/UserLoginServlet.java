package com.collegeadmission.servlet;
import java.io.PrintWriter;

import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.collegeadmission.daoimplementation.UserDaoImpl;
//import com.collegeadmission.daoimplementation.UserDaoImpl;
import com.collegeadmission.model.UserDetails;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/userlogin")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginServlet() {
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
//	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		 String email=request.getParameter("email");
		 String Password=request.getParameter("password");
		 UserDetails users =new UserDetails();
		 users.setEmail(email);
		 users.setUserPassword(Password);
		 UserDaoImpl obj=new  UserDaoImpl();
		 users=obj.loginUser(email, Password);
		 //response.sendRedirect("UserView.jsp");
				 if(users!=null){
					 PrintWriter write=response.getWriter();

				write.print("not a registered user");
			
			} else {
					response.sendRedirect("UserView.jsp");
			}
	}

}
