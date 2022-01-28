package com.collegeadmission.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.collegeadmission.impl.ApplicationDaoImpl;
import com.collegeadmission.model.ApplicationDetails;

/**
 * Servlet implementation class InsertApplicationServlet
 */
@WebServlet("/InsertApplicationServlet")
public class InsertApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertApplicationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		int UserId=Integer.parseInt(request.getParameter("userid"));
		String StudentName= request.getParameter("studentname");
		String FatherName= request.getParameter("fathername");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		long  AadharNumber=Long.parseLong(request.getParameter("aadharnumber"));
		int SslcMark= Integer.parseInt(request.getParameter("sslcMark"));
		int HscMark= Integer.parseInt(request.getParameter("hscMark"));
		String Address= request.getParameter("address");
		String City= request.getParameter("city");
		int Pincode = Integer.parseInt(request.getParameter("pincode"));
		String UserState= request.getParameter("state");
		String Nationality = request.getParameter("nationality");
		
		Date dt=null;
		dt=sdf.parse(request.getParameter("dateofbirth"));
		System.out.println(dt);
		ApplicationDetails obj = new ApplicationDetails(UserId,StudentName,FatherName,dt,AadharNumber,SslcMark,HscMark,Address,City,Pincode,UserState,Nationality);
		ApplicationDaoImpl ad = new ApplicationDaoImpl();
		ad.insertApplication(obj);
		HttpSession session=request.getSession();
		session.setAttribute("application", obj);
		 response.sendRedirect("ViewCourses.jsp");
		
		response.getWriter().print("Register Successful");
		
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		} 
		
		

	}

}
