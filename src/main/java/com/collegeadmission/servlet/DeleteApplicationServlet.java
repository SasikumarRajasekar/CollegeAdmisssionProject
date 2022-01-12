package com.collegeadmission.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.collegeadmission.daoimplementation.ApplicationDaoImpl;
import com.collegeadmission.model.ApplicationDetails;

/**
 * Servlet implementation class DeleteApplicationServlet
 */
@WebServlet("/DeleteApplicationServlet")
public class DeleteApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteApplicationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		HttpSession session1=request.getSession();
		try {

		//int applicationId=Integer.parseInt(request.getParameter("applicationId").toString());
		int appid = Integer.parseInt(request.getParameter("applicationId"));
		System.out.println(appid);
		ApplicationDetails apid=new ApplicationDetails(appid);
		ApplicationDaoImpl app=new ApplicationDaoImpl();
		
			app.deleteApplication(appid);
				HttpSession session=request.getSession();
				session.setAttribute("deleteApplicationDetail","Application deleted successfully");
//				response.sendRedirect("ShowApplications.jsp");
				
				response.getWriter().print("Deleted ");
			
		}
			
			catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				e.printStackTrace();
			}
		
	}}
				


