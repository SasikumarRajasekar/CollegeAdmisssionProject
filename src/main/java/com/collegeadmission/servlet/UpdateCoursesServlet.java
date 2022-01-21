package com.collegeadmission.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.collegeadmission.impl.ApplicationDaoImpl;
import com.collegeadmission.model.ApplicationDetails;

/**
 * Servlet implementation class UpdateCoursesServlet
 */
@WebServlet("/UpdateCoursesServlet")
public class UpdateCoursesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCoursesServlet() {
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
			

			ApplicationDetails ad = new ApplicationDetails(studentName,fatherName,sslcMark,hscMark,address,city,pincode,userState,nationality,applicationId);
			ApplicationDaoImpl obj =new ApplicationDaoImpl();
			
				obj.updateApplication(ad);
				response.sendRedirect("UserView.jsp");
						
			} catch (Exception e) {
				
				System.out.println(e);
			} 
	}

}
