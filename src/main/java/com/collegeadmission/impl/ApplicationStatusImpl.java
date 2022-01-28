package com.collegeadmission.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.collegeadmission.connection.ConnectionUtil;
import com.collegeadmission.model.ApplicationStatus;

public class ApplicationStatusImpl {
	
public void applicationStatus(ApplicationStatus appStatus) throws ClassNotFoundException, SQLException {
		
		Connection con= ConnectionUtil.getDBConnect();
		String query = " insert into application_status(user_id,application_id,course_id,payment_status,application_status)values(?,?,?,?,?)";
		
		PreparedStatement stmt= con.prepareStatement(query);

		stmt.setInt(1, appStatus.getUserId());
		System.out.println(appStatus.getUserId());
		//int appID=applicationdetailsdao.findAppID(appStatus.getUserId());
		//stmt.setInt(2, appID);
		//System.out.println(appID);
		stmt.setInt(3, appStatus.getCourseId());
		System.out.println(appStatus.getCourseId());
		stmt.setString(4, appStatus.getPaymentStatus());
		stmt.setString(5, appStatus.getApplicationStatus());
		
		stmt.executeUpdate();
		System.out.println("Insert Applicant Status Successfully");
	}


public void updateApplicationStatus(ApplicationStatus as1)throws ClassNotFoundException, SQLException {
	
	 Connection con=ConnectionUtil.getDBConnect();
	
	String update = "update job_status set payment_status=?, application_status=? where status_id=?";
	System.out.println(update);
	PreparedStatement stmt = con.prepareStatement(update);
	 	
	stmt.setString(1, as1.getPaymentStatus());
	stmt.setString(2, as1.getApplicationStatus());
	//-stmt.setInt(3, as1.getStatusId());
	
		System.out.println(stmt.executeUpdate() + " is updated !!");
	 
}


public List<ApplicationStatus> showAppStatus() throws ClassNotFoundException, SQLException {
	 
	 
	 String query ="select * from application_status";
	 ApplicationStatus appStatus;
	 List<ApplicationStatus> show= new ArrayList<ApplicationStatus>();
	 Connection con=ConnectionUtil.getDBConnect();
	 PreparedStatement ps =con.prepareStatement(query);
	 
	 ResultSet rs=ps.executeQuery();
	 
	
	 while(rs.next())
	 {
		 //appStatus= new ApplicationStatus(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getString(6));
	
		 //show.add(appStatus);
	
	  }

	 return show;
}

}
