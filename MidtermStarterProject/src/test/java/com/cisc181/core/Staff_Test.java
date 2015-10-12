package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
				
	
	@Test
	public void Salary_Test() throws PersonException {
		ArrayList<Staff> StaffList = new ArrayList();
		Staff S1 = new Staff("John", "Michael", "Doe", new Date(), "123 Red Rd", "302-112-3344", "jmd@udel.edu", "4-6", 0, 50000, new Date(), eTitle.DEAN);
		Staff S2 = new Staff("Matt", "Ben", "Johnson", new Date(), "123 Blue Ln", "302-965-4678", "bmj@udel.edu", "10-12", 0, 60000, new Date(), eTitle.PROFESSOR);
		Staff S3 = new Staff("Mike", "Robert", "Davidson", new Date(), "123 Orange Ave", "302-676-5323", "mrd@udel.edu", "3-4", 0, 10000, new Date(), eTitle.TA);
		Staff S4 = new Staff("Jane", "Michelle", "Doe", new Date(), "123 Yellow Rd", "302-067-5438", "jamd@udel.edu", "5-7", 0, 80000, new Date(), eTitle.PROFESSOR);
		Staff S5 = new Staff("Albert", "Davis", "Walters", new Date(), "123 Color Ct", "302-785-6432", "adw@udel.edu", "2-5", 0, 100000, new Date(), eTitle.PROFESSOR);
		StaffList.add(S1);
		StaffList.add(S2);
		StaffList.add(S3);
		StaffList.add(S4);
		StaffList.add(S5);
		
		double avgSalary = (S1.getSalary() + S2.getSalary() + S3.getSalary() + S4.getSalary() + S5.getSalary()) / 5;
		// 50000 + 60000 + 10000 + 80000 + 100000 ----> 300000 / 5 = 60000
		
		assertEquals(avgSalary, 60000, 0);
	}
	
	@Test(expected = PersonException.class)
	public void Phone_Test() throws PersonException {
		Staff BadNum = new Staff("John", "H.", "Johnson", new Date(), "100 East St", "302-111-111", "jhj@udel.edu", "4-6", 0, 10000, new Date(), eTitle.PROFESSOR);
	}

}
