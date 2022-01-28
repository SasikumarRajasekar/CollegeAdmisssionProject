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
 * Servlet implementation class UpdateApplicationStatusServlet
 */
@WebServlet("/UpdateApplicationStatusServlet")
public class UpdateApplicationStatusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateApplicationStatusServlet() {
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
			String PaymentStatus= request.getParameter("paymentStatus");
			String ApplicationStatus= request.getParameter("applicationStatus");
			int StatusId = Integer.parseInt(request.getParameter("statusId"));
			

			//ApplicationStatus ad = new ApplicationStatus(PaymentStatus,ApplicationStatus,StatusId);
			ApplicationStatusImpl obj =new ApplicationStatusImpl();
			
				//obj.updateApplicationStatus(ad);
				response.sendRedirect("UserView.jsp");
						
			} catch (Exception e) {
				
				System.out.println(e);
			} 
	}

}
