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
 * Servlet implementation class InsertCoursesServlet
 */
@WebServlet("/InsertCoursesServlet")
public class InsertCoursesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertCoursesServlet() {
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
			int CourseId = Integer.parseInt(request.getParameter("courseId"));
			String CourseType= request.getParameter("courseType");
			String CourseName= request.getParameter("courseName");
			int AdmissionFees= Integer.parseInt(request.getParameter("admissionFees"));
			int TuitionFees= Integer.parseInt(request.getParameter("tuitionFees"));
			
			CourseDetails obj = new CourseDetails(CourseId,CourseType,CourseName,AdmissionFees,TuitionFees);
			CoursesDaoImpl ad = new CoursesDaoImpl();
			ad.coursesDetails(obj);
			
			response.getWriter().print("Course Inserted Successfully");
			
				
			} 
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(e);
			} 
			
			

		}

		
	}


