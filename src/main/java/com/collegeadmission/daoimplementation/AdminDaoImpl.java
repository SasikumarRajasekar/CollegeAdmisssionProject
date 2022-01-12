package com.collegeadmission.daoimplementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.collegeadmission.connection.ConnectionUtil;
import com.collegeadmission.model.Admin;
import com.collegeadmission.model.UserDetails;

public class AdminDaoImpl {
	
	public void adminDetails(Admin admin) throws SQLException, ClassNotFoundException {
	
	String adminQuery = "insert into admin_details(Admin_Id,Admin_Name,Admin_Email,Admin_Password) values(?,?,?)";

	Connection con = ConnectionUtil.getDBConnect();
	
	PreparedStatement pstmt = con.prepareStatement(adminQuery);
	
	pstmt.setInt(1, admin.getAdminId());
	pstmt.setString(2, admin.getAdminName());
	pstmt.setString(3, admin.getAdminEmail());
	pstmt.setString(4, admin.getAdminPassword());
	

		
		int result=pstmt.executeUpdate();
		System.out.println(result+ " is updated !!");
		pstmt.close();
		con.close();
    }
	
	public Boolean loginAdmin(String AdminEmail,String AdminPassword) throws ClassNotFoundException, SQLException
	{
		
		
		 Connection con = ConnectionUtil.getDBConnect();
			
		 String loginQuery="select * from admin_details where Admin_Email'"+AdminEmail+"' and  Admin_Password='"+AdminPassword+"'" ;
				
		    PreparedStatement stmt = con.prepareStatement(loginQuery);
		    
		    System.out.println("Registered ");
				
		    stmt.setString(1, AdminEmail);
			stmt.setString(2, AdminPassword);
				
			int i = stmt.executeUpdate();
				
if(i>0)
{
				return true;

				//System.out.println("welcome "+rs.getString("first_name") );
				}else {
						return false;
				}
	}
	}


