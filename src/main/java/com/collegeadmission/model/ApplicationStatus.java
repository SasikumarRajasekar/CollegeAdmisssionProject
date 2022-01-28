package com.collegeadmission.model;

import java.util.Objects;

public class ApplicationStatus {
	
	private int userId;
	private int applicationId;
	private int courseId;
	private String paymentStatus;
	private String applicationStatus;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getApplicationStatus() {
		return applicationStatus;
	}
	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	@Override
	public int hashCode() {
		return Objects.hash(applicationId, applicationStatus, courseId, paymentStatus, userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplicationStatus other = (ApplicationStatus) obj;
		return applicationId == other.applicationId && Objects.equals(applicationStatus, other.applicationStatus)
				&& courseId == other.courseId && Objects.equals(paymentStatus, other.paymentStatus)
				 && userId == other.userId;
	}
	@Override
	public String toString() {
		return "ApplicationStatus [ userId=" + userId + ", applicationId="
				+ applicationId + ", courseId=" + courseId + ", paymentStatus=" + paymentStatus + ", applicationStatus="
				+ applicationStatus + "]";
	}
	public ApplicationStatus( int userId, int applicationId, int courseId, String paymentStatus,
			String applicationStatus) {
		super();
		
		this.userId = userId;
		this.applicationId = applicationId;
		this.courseId = courseId;
		this.paymentStatus = paymentStatus;
		this.applicationStatus = applicationStatus;
	}
	public ApplicationStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}
