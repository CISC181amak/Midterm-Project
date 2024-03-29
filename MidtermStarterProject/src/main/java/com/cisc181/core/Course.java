package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {

	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	public Course() {
		
	}
	
	public Course(UUID courseID, String courseName, int gradePoints, eMajor em) {
		this.CourseID = courseID;
		this.CourseName = courseName;
		this.GradePoints = gradePoints;
		this.Major = em;
	}

	public UUID getCourseID() {
		return CourseID;
	}

	public String getCourseName() {
		return CourseName;
	}

	public int getGradePoints() {
		return GradePoints;
	}

	public eMajor getMajor() {
		return Major;
	}
	
	
}
