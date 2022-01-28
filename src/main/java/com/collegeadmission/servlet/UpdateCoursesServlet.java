package com.collegeadmission.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.collegeadmission.impl.CoursesDaoImpl;
import com.collegeadmission.model.CourseDetails;

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
			
			int AdmissionFees= Integer.parseInt(request.getParameter("admissionFees"));
			int TuitionFees= Integer.parseInt(request.getParameter("tuitionFees"));
			int CourseId = Integer.parseInt(request.getParameter("courseId"));
			

			CourseDetails ad = new CourseDetails(AdmissionFees,TuitionFees,CourseId);
			CoursesDaoImpl obj =new CoursesDaoImpl();
			
				obj.updateCourses(ad);
				response.sendRedirect("UserView.jsp");
						
			} catch (Exception e) {
				
				System.out.println(e);
			} 
	}

}
