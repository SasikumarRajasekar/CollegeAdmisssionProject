package com.collegeadmission.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.collegeadmission.connection.*;
import com.collegeadmission.model.UserDetails;


	public class UserDaoImpl {
		
		Scanner sc = new Scanner(System.in);
		
		public void insert(UserDetails str)throws ClassNotFoundException, SQLException

		{
			
			Connection con= ConnectionUtil.getDBConnect();
			String query = "insert into user_details(User_Name,Email,Mobile_Number,User_Password) values(?,?,?,?)";
			
			PreparedStatement pstmt= con.prepareStatement(query);
			
			pstmt.setString(1,str.getUserName());
			pstmt.setString(2,str.getEmail());
			pstmt.setLong(3,str.getMobileNumber());
			pstmt.setString(4,str.getUserPassword());
			
			pstmt.executeUpdate();
			System.out.println("Register User successfully");
		}
		
		public ResultSet getEmailDetails(UserDetails rp) throws SQLException, ClassNotFoundException {
			Connection con=ConnectionUtil.getDBConnect();
			String query="select * from user_details where email=?";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1, rp.getEmail());
			ResultSet rs=pstmt.executeQuery();
			return rs;
		}
		
		public boolean login(String emailId, String Password ) throws ClassNotFoundException, SQLException {
			
		    
		    Connection con = ConnectionUtil.getDBConnect();
				
		    String query = "select * from user_details where Email= ? and User_Password= ? ";
				
		    PreparedStatement stmt = con.prepareStatement(query);
		    
		    System.out.println("Registered ");
				
		    stmt.setString(1, emailId);
			stmt.setString(2, Password);
				
			int i = stmt.executeUpdate();
				
	if(i>0)
	{
				return true;

				
				}else {
						return false;
				}
	}
		
				
		public List<UserDetails> showAllUsers() throws ClassNotFoundException, SQLException
	    {
	    	List<UserDetails> userList = new ArrayList<UserDetails>();
	    	String showusersquery="select * from user_details";
	    	Connection con = ConnectionUtil.getDBConnect();
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
				ps = con.prepareStatement(showusersquery);
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					System.out.println(rs.getString(2));
					UserDetails userdetails =new UserDetails(rs.getInt(1),rs.getString(2),rs.getString(3),(long)rs.getLong(4),rs.getString(5));
					userList.add(userdetails);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	return userList;
	    }

	}
		
		



	