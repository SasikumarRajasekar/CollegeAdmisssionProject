package com.collegeadmission.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.collegeadmission.daoimplementation.ApplicationDaoImpl;
import com.collegeadmission.model.ApplicationDetails;

/**
 * Servlet implementation class UpdateApplication
 */
@WebServlet("/UpdateApplication")
public class UpdateApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateApplicationServlet() {
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
		// TODO Auto-generated method stub
		
		try {
		String studentName= request.getParameter("studentName");
		String fatherName= request.getParameter("fatherName");
		int sslcMark= Integer.parseInt(request.getParameter("sslcMark"));
		int hscMark= Integer.parseInt(request.getParameter("hscMark"));
		String address= request.getParameter("address");
		String city= request.getParameter("city");
		int pincode = Integer.parseInt(request.getParameter("pincode"));
		String userState= request.getParameter("State");
		String nationality= request.getParameter("nationality");
		int applicationId = Integer.parseInt(request.getParameter("applicationId"));
		
//		ApplicationDetails applicationdetail = new ApplicationDetails();
//		applicationdetail.setStudentName(studentName);
//		applicationdetail.setFatherName(fatherName);
//		applicationdetail.setSslcMark(sslcMark);
//		applicationdetail.setHscMark(hscMark);
//		applicationdetail.setAddress(address);
//		applicationdetail.setCity(city);
//		applicationdetail.setPincode(pincode);
//		applicationdetail.setUserState(userState);
//		applicationdetail.setNationality(nationality);
//		applicationdetail.setApplicationId(applicationId);
//		ApplicationDaoImpl obj =new ApplicationDaoImpl();
//		//PrintWriter out=response.getWriter();
//		
//		boolean flag = false;
//		try {
//			flag = obj.updateApplication(applicationdetail);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		if(flag)
//		{
//		
//			 response.sendRedirect("UserView.jsp");
//				
//		}
//		else
//		{
//			
//			 response.sendRedirect("UserView.jsp");
//		}
//		
//	}

		ApplicationDetails ad = new ApplicationDetails(studentName,fatherName,sslcMark,hscMark,address,city,pincode,userState,nationality,applicationId);
		ApplicationDaoImpl obj =new ApplicationDaoImpl();
		
			obj.updateApplication(ad);
			response.sendRedirect("UserView.jsp");
					
		} catch (Exception e) {
			
			System.out.println(e);
		} 
}
}
