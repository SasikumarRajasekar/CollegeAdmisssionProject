package com.collegeadmission.daoimplementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.collegeadmission.connection.ConnectionUtil;
import com.collegeadmission.model.CourseDetails;
import com.collegeadmission.model.UserDetails;

public class CoursesDaoImpl {
	
	public void coursesDetails(CourseDetails courseDetails) throws ClassNotFoundException, SQLException {
		
		String courseQuery = "insert into courses_details(Course_Id,Course_Type,Course_Name,Admission_Fees,Tuition_Fees) values(?,?,?,?,?)";
		
		Connection con = ConnectionUtil.getDBConnect();
		
		PreparedStatement pstmt = con.prepareStatement(courseQuery);
		
		pstmt.setInt(1,courseDetails.getCourseId());
		pstmt.setString(2,courseDetails.getCourseType());
		pstmt.setString(3,courseDetails.getCourseName());
		pstmt.setInt(4, courseDetails.getAdmissionFees());
		pstmt.setInt(5, courseDetails.getTuitionFees());
			
			int result=pstmt.executeUpdate();
			System.out.println("Course Selected Successfully");
			pstmt.close();
			con.close();
	    }
	
	public void updateCourses (CourseDetails coursedetails) throws ClassNotFoundException, SQLException {
    	
    	String update="update courses_details set course_type=?, course_name=?, admission_fees=?, tuition_fees=? where course_id=?";
    	
    	Connection con=ConnectionUtil.getDBConnect();
		PreparedStatement ps=con.prepareStatement(update);
		
		ps.setString(1,coursedetails.getCourseType());
		ps.setString(2,coursedetails.getCourseName());
		ps.setInt(3, coursedetails.getAdmissionFees());
		ps.setInt(4, coursedetails.getTuitionFees());
		ps.setInt(5, coursedetails.getCourseId());
		
		
		int result=ps.executeUpdate();
		System.out.println(result+ " is updated !!");
		ps.close();
		con.close();
	
    }

	
	public void deleteCourses (CourseDetails coursedetails) throws ClassNotFoundException, SQLException {
		
		String del="delete from courses_details where course_id=?";
		
		Connection con=ConnectionUtil.getDBConnect();
		PreparedStatement ps=con.prepareStatement(del);
		
		ps.setInt(1,coursedetails.getCourseId());
		int res=ps.executeUpdate();
		System.out.println(res + "is deleted");
		ps.close();
		con.close();		
	}

	public List<CourseDetails> showAllCourses() throws ClassNotFoundException, SQLException
    {
    	List<CourseDetails> courseList = new ArrayList<CourseDetails>();
    	String showcoursesquery="select * from courses_details";
    	Connection con = null;
    	PreparedStatement ps;
    	try {
			con = ConnectionUtil.getDBConnect();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	try {
			ps = con.prepareStatement(showcoursesquery);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				CourseDetails coursedetails =new CourseDetails(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5));
				courseList.add(coursedetails);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return courseList;
    }

		
	}

