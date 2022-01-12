package com.collegeadmission.model;

import java.util.Objects;

public class CourseDetails {
	
	private int courseId;
	private String courseType;
	private String courseName;
	private int admissionFees;
	private int tuitionFees;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getAdmissionFees() {
		return admissionFees;
	}
	public void setAdmissionFees(int admissionFees) {
		this.admissionFees = admissionFees;
	}
	public int getTuitionFees() {
		return tuitionFees;
	}
	public void setTuitionFees(int tuitionFees) {
		this.tuitionFees = tuitionFees;
	}
	@Override
	public int hashCode() {
		return Objects.hash(admissionFees, courseId, courseName, courseType, tuitionFees);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CourseDetails other = (CourseDetails) obj;
		return admissionFees == other.admissionFees && courseId == other.courseId
				&& Objects.equals(courseName, other.courseName) && Objects.equals(courseType, other.courseType)
				&& tuitionFees == other.tuitionFees;
	}
	@Override
	public String toString() {
		return "CourseDetails [courseId=" + courseId + ", courseType=" + courseType + ", courseName=" + courseName
				+ ", admissionFees=" + admissionFees + ", tuitionFees=" + tuitionFees + "]";
	}
	public CourseDetails(int courseId, String courseType, String courseName, int admissionFees, int tuitionFees) {
		super();
		this.courseId = courseId;
		this.courseType = courseType;
		this.courseName = courseName;
		this.admissionFees = admissionFees;
		this.tuitionFees = tuitionFees;
	}
	public CourseDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CourseDetails(int courseId) {
		// TODO Auto-generated constructor stub
		this.courseId=courseId;
	}
	public CourseDetails(String courseType, String courseName, int admissionFees, int tuitionFees, int courseId) {
		// TODO Auto-generated constructor stub
		
		this.courseType = courseType;
		this.courseName = courseName;
		this.admissionFees = admissionFees;
		this.tuitionFees = tuitionFees;
		this.courseId = courseId;
	}

	
	
}
