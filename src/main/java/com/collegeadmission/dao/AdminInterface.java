package com.collegeadmission.dao;

import java.sql.SQLException;

import com.collegeadmission.model.Admin;

public interface AdminInterface {

	public void adminDetails(Admin admin) throws SQLException, ClassNotFoundException;
	public String loginAdmin(String AdminEmail,String AdminPassword);
}
