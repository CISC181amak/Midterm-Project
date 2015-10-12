package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {
	
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	public Semester() {}
	
	public Semester(UUID semesterID, Date SD, Date ED) {
		this.SemesterID = semesterID;
		this.StartDate = SD;
		this.EndDate = ED;
	}

	public UUID getSemesterID() {
		return SemesterID;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public Date getEndDate() {
		return EndDate;
	}
	

}