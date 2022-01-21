package com.collegeadmission.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

//import java.io.PrintWriter;
//import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.collegeadmission.impl.UserDaoImpl;
import com.collegeadmission.model.UserDetails;
import com.collegeadmissionproject.exception.EmailAlreadyExistException;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
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
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		String username=request.getParameter("username");
		String email=request.getParameter("email");
		long mobileno=Long.parseLong(request.getParameter("mobileno"));
		String password=request.getParameter("password");
		
		UserDetails obj=new UserDetails(username,email,mobileno,password);
		UserDaoImpl ins=new UserDaoImpl();
		try
		{
			
			ResultSet rs=ins.getEmailDetails(obj);
			if(rs.next()){
				System.out.println(rs.getString(3));
				if(email.equals(rs.getString(3))) {
					throw new EmailAlreadyExistException();
				}
			}
		ins.insert(obj);

		
		   //response.getWriter().print("Register Suceessfully");

		   session.setAttribute("registered","You've registered successfully");
		   response.sendRedirect("UserLogin.jsp");
		
	} catch (IOException e) {
		System.out.println(e);
		
	}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		catch (EmailAlreadyExistException e) {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('email already exist');");
			out.println("location='Register.jsp';");
			out.println("</script>");
			//res.sendRedirect("errorpage.jsp?message="+ea.getMessage()+"&url=Register.jsp");
		} 
		
}}