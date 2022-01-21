package com.collegeadmissionproject.exception;

public class EmailAlreadyExistException extends Exception{
	
	public String emailexist() {
		return "Register.jsp";
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Email already exist";
	}
	

}
