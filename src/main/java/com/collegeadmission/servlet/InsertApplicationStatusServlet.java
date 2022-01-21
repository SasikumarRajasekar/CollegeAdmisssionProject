package com.collegeadmission.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.collegeadmission.impl.ApplicationStatusImpl;
import com.collegeadmission.model.ApplicationStatus;


/**
 * Servlet implementation class InsertApplicationStatusServlet
 */
@WebServlet("/InsertApplicationStatusServlet")
public class InsertApplicationStatusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertApplicationStatusServlet() {
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
		doGet(request, response);
		
		try {
			int StatusId = Integer.parseInt(request.getParameter("statusId"));
			int UserId= Integer.parseInt(request.getParameter("userId"));
			int ApplicationId= Integer.parseInt(request.getParameter("applicationId"));
			int CourseId= Integer.parseInt(request.getParameter("courseId"));
			String PaymentStatus= request.getParameter("paymentStatus");
			String ApplicationStatus= request.getParameter("applicationStatus");
						
			ApplicationStatus obj = new ApplicationStatus(StatusId,UserId,ApplicationId,CourseId,PaymentStatus,ApplicationStatus);
			ApplicationStatusImpl ad = new ApplicationStatusImpl();
			ad.applicationStatus(obj);
			
			response.getWriter().print("Register Successful");
			
				
			} 
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(e);
			} 
			
			

		}

	}

