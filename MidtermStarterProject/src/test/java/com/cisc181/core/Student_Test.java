package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	
	@BeforeClass
	public static void initialize() throws PersonException {
	Course PHYS = new Course(UUID.randomUUID(), "PHYS201", 100, eMajor.PHYSICS);
	Course CHEM = new Course(UUID.randomUUID(), "CHEM201", 100, eMajor.CHEM);
	Course COMPSCI = new Course(UUID.randomUUID(), "CISC181", 100, eMajor.COMPSI);
	
	ArrayList<Course> Courses = new ArrayList();
	Courses.add(PHYS);
	Courses.add(CHEM);
	Courses.add(COMPSCI);
	
	Semester FallSemester = new Semester(UUID.randomUUID(), new Date(), new Date());
	Semester SpringSemester = new Semester(UUID.randomUUID(), new Date(), new Date());
	ArrayList<Semester> Semesters = new ArrayList();
	Semesters.add(FallSemester);
	Semesters.add(SpringSemester);
	
	Section PHYS_S1 = new Section(PHYS.getCourseID(), FallSemester.getSemesterID(), UUID.randomUUID(), 101);
	Section PHYS_S2 = new Section(PHYS.getCourseID(), SpringSemester.getSemesterID(), UUID.randomUUID(), 101);
	Section CHEM_S1 = new Section(CHEM.getCourseID(), FallSemester.getSemesterID(), UUID.randomUUID(), 202);
	Section CHEM_S2 = new Section(CHEM.getCourseID(), SpringSemester.getSemesterID(), UUID.randomUUID(), 202);
	Section COMP_S1 = new Section(COMPSCI.getCourseID(), FallSemester.getSemesterID(), UUID.randomUUID(), 005);
	Section COMP_S2 = new Section(COMPSCI.getCourseID(), SpringSemester.getSemesterID(), UUID.randomUUID(), 005);
	ArrayList<Section> Sections = new ArrayList();
	Sections.add(PHYS_S1);
	Sections.add(PHYS_S2);
	Sections.add(CHEM_S1);
	Sections.add(CHEM_S2);
	Sections.add(COMP_S1);
	Sections.add(COMP_S2);
	
	
	Student S1 = new Student("John", "J", "Jacobson", new Date(), eMajor.PHYSICS, "123 Harmony Rd", "302-453-7869", "jjj@udel.edu");
	Student S2 = new Student("Matt", "C", "Schmitt", new Date(), eMajor.COMPSI, "123 East Fifth St", "302-847-9826", "mcs@udel.edu");
	Student S3 = new Student("Michael", "X", "Thompson", new Date(), eMajor.CHEM, "123 Main St", "302-254-5938", "mxt@udel.edu");
	Student S4 = new Student("Juan", "R", "Velez", new Date(), eMajor.PHYSICS, "123 Market St", "302-356-2365", "jrv@udel.edu");
	Student S5 = new Student("Max", "Q", "McDonald", new Date(), eMajor.BUSINESS, "123 Broad St", "302-438-2331", "mqm@udel.edu");
	Student S6 = new Student("Emily", "S", "Smith", new Date(), eMajor.NURSING, "123 Sunshine Blvd", "302-836-4367", "ess@udel.edu");
	Student S7 = new Student("Sarah", "R", "Michaels", new Date(), eMajor.PHYSICS, "123 Melody Rd", "302-645-8967", "srm@udel.edu");
	Student S8 = new Student("Jim", "D", "Jones", new Date(), eMajor.CHEM, "123 Circle Ct", "302-345-7456", "jdj@udel.edu");
	Student S9 = new Student("Tyler", "A", "Brown", new Date(), eMajor.BUSINESS, "123 Blue Dr", "302-398-7849", "tab@udel.edu");
	Student S10 = new Student("Jenn", "F", "Taylor", new Date(), eMajor.COMPSI, "123 Green St", "302-143-9795", "jft@udel.edu");
	ArrayList<Student> Students = new ArrayList();
	Students.add(S1);
	Students.add(S2);
	Students.add(S3);
	Students.add(S4);
	Students.add(S5);
	Students.add(S6);
	Students.add(S7);
	Students.add(S8);
	Students.add(S9);
	Students.add(S10);
	
	Enrollment E1 = new Enrollment(S1.getID(), PHYS_S1.getSectionID());
	Enrollment E2 = new Enrollment(S2.getID(), PHYS_S1.getSectionID());
	Enrollment E3 = new Enrollment(S3.getID(), PHYS_S1.getSectionID());
	Enrollment E4 = new Enrollment(S4.getID(), PHYS_S1.getSectionID());
	Enrollment E5 = new Enrollment(S5.getID(), PHYS_S1.getSectionID());
	Enrollment E6 = new Enrollment(S6.getID(), PHYS_S1.getSectionID());
	Enrollment E7 = new Enrollment(S7.getID(), PHYS_S1.getSectionID());
	Enrollment E8 = new Enrollment(S8.getID(), PHYS_S1.getSectionID());
	Enrollment E9 = new Enrollment(S9.getID(), PHYS_S1.getSectionID());
	Enrollment E10 = new Enrollment(S10.getID(), PHYS_S1.getSectionID());
	Enrollment E11 = new Enrollment(S1.getID(), PHYS_S2.getSectionID());
	Enrollment E12 = new Enrollment(S2.getID(), PHYS_S2.getSectionID());
	Enrollment E13 = new Enrollment(S3.getID(), PHYS_S2.getSectionID());
	Enrollment E14 = new Enrollment(S4.getID(), PHYS_S2.getSectionID());
	Enrollment E15 = new Enrollment(S5.getID(), PHYS_S2.getSectionID());
	Enrollment E16 = new Enrollment(S6.getID(), PHYS_S2.getSectionID());
	Enrollment E17 = new Enrollment(S7.getID(), PHYS_S2.getSectionID());
	Enrollment E18 = new Enrollment(S8.getID(), PHYS_S2.getSectionID());
	Enrollment E19 = new Enrollment(S9.getID(), PHYS_S2.getSectionID());
	Enrollment E20 = new Enrollment(S10.getID(), PHYS_S2.getSectionID());
	Enrollment E21 = new Enrollment(S1.getID(), CHEM_S1.getSectionID());
	Enrollment E22 = new Enrollment(S2.getID(), CHEM_S1.getSectionID());
	Enrollment E23 = new Enrollment(S3.getID(), CHEM_S1.getSectionID());
	Enrollment E24 = new Enrollment(S4.getID(), CHEM_S1.getSectionID());
	Enrollment E25 = new Enrollment(S5.getID(), CHEM_S1.getSectionID());
	Enrollment E26 = new Enrollment(S6.getID(), CHEM_S1.getSectionID());
	Enrollment E27 = new Enrollment(S7.getID(), CHEM_S1.getSectionID());
	Enrollment E28 = new Enrollment(S8.getID(), CHEM_S1.getSectionID());
	Enrollment E29 = new Enrollment(S9.getID(), CHEM_S1.getSectionID());
	Enrollment E30 = new Enrollment(S10.getID(), CHEM_S1.getSectionID());
	Enrollment E31 = new Enrollment(S1.getID(), CHEM_S2.getSectionID());
	Enrollment E32 = new Enrollment(S2.getID(), CHEM_S2.getSectionID());
	Enrollment E33 = new Enrollment(S3.getID(), CHEM_S2.getSectionID());
	Enrollment E34 = new Enrollment(S4.getID(), CHEM_S2.getSectionID());
	Enrollment E35 = new Enrollment(S5.getID(), CHEM_S2.getSectionID());
	Enrollment E36 = new Enrollment(S6.getID(), CHEM_S2.getSectionID());
	Enrollment E37 = new Enrollment(S7.getID(), CHEM_S2.getSectionID());
	Enrollment E38 = new Enrollment(S8.getID(), CHEM_S2.getSectionID());
	Enrollment E39 = new Enrollment(S9.getID(), CHEM_S2.getSectionID());
	Enrollment E40 = new Enrollment(S10.getID(), CHEM_S2.getSectionID());
	Enrollment E41 = new Enrollment(S1.getID(), COMP_S1.getSectionID());
	Enrollment E42 = new Enrollment(S2.getID(), COMP_S1.getSectionID());
	Enrollment E43 = new Enrollment(S3.getID(), COMP_S1.getSectionID());
	Enrollment E44 = new Enrollment(S4.getID(), COMP_S1.getSectionID());
	Enrollment E45 = new Enrollment(S5.getID(), COMP_S1.getSectionID());
	Enrollment E46 = new Enrollment(S6.getID(), COMP_S1.getSectionID());
	Enrollment E47 = new Enrollment(S7.getID(), COMP_S1.getSectionID());
	Enrollment E48 = new Enrollment(S8.getID(), COMP_S1.getSectionID());
	Enrollment E49 = new Enrollment(S9.getID(), COMP_S1.getSectionID());
	Enrollment E50 = new Enrollment(S10.getID(), COMP_S1.getSectionID());
	Enrollment E51 = new Enrollment(S1.getID(), COMP_S2.getSectionID());
	Enrollment E52 = new Enrollment(S2.getID(), COMP_S2.getSectionID());
	Enrollment E53 = new Enrollment(S3.getID(), COMP_S2.getSectionID());
	Enrollment E54 = new Enrollment(S4.getID(), COMP_S2.getSectionID());
	Enrollment E55 = new Enrollment(S5.getID(), COMP_S2.getSectionID());
	Enrollment E56 = new Enrollment(S6.getID(), COMP_S2.getSectionID());
	Enrollment E57 = new Enrollment(S7.getID(), COMP_S2.getSectionID());
	Enrollment E58 = new Enrollment(S8.getID(), COMP_S2.getSectionID());
	Enrollment E59 = new Enrollment(S9.getID(), COMP_S2.getSectionID());
	Enrollment E60 = new Enrollment(S10.getID(), COMP_S2.getSectionID());
	
	E1.setGrade(90);
	E2.setGrade(80);
	E3.setGrade(70);
	E4.setGrade(60);
	E5.setGrade(75);
	E6.setGrade(85);
	E7.setGrade(95);
	E8.setGrade(82);
	E9.setGrade(50);
	E10.setGrade(100);
	E11.setGrade(90);
	E12.setGrade(80);
	E13.setGrade(70);
	E14.setGrade(60);
	E15.setGrade(75);
	E16.setGrade(85);
	E17.setGrade(95);
	E18.setGrade(82);
	E19.setGrade(50);
	E20.setGrade(100);
	E21.setGrade(90);
	E22.setGrade(80);
	E23.setGrade(70);
	E24.setGrade(60);
	E25.setGrade(75);
	E26.setGrade(85);
	E27.setGrade(95);
	E28.setGrade(82);
	E29.setGrade(50);
	E30.setGrade(100);
	E31.setGrade(90);
	E32.setGrade(80);
	E33.setGrade(70);
	E34.setGrade(60);
	E35.setGrade(75);
	E36.setGrade(85);
	E37.setGrade(95);
	E38.setGrade(82);
	E39.setGrade(50);
	E40.setGrade(100);
	E41.setGrade(90);
	E42.setGrade(80);
	E43.setGrade(70);
	E44.setGrade(60);
	E45.setGrade(75);
	E46.setGrade(85);
	E47.setGrade(95);
	E48.setGrade(82);
	E49.setGrade(50);
	E50.setGrade(100);
	E51.setGrade(90);
	E52.setGrade(80);
	E53.setGrade(70);
	E54.setGrade(60);
	E55.setGrade(75);
	E56.setGrade(85);
	E57.setGrade(95);
	E58.setGrade(82);
	E59.setGrade(50);
	E60.setGrade(100);
	
	ArrayList<Enrollment> Enrollments = new ArrayList();
	Enrollments.add(E1);
	Enrollments.add(E2);
	Enrollments.add(E3);
	Enrollments.add(E4);
	Enrollments.add(E5);
	Enrollments.add(E6);
	Enrollments.add(E7);
	Enrollments.add(E8);
	Enrollments.add(E9);
	Enrollments.add(E10);
	Enrollments.add(E11);
	Enrollments.add(E12);
	Enrollments.add(E13);
	Enrollments.add(E14);
	Enrollments.add(E15);
	Enrollments.add(E16);
	Enrollments.add(E17);
	Enrollments.add(E18);
	Enrollments.add(E19);
	Enrollments.add(E20);
	Enrollments.add(E21);
	Enrollments.add(E22);
	Enrollments.add(E23);
	Enrollments.add(E24);
	Enrollments.add(E25);
	Enrollments.add(E26);
	Enrollments.add(E27);
	Enrollments.add(E28);
	Enrollments.add(E29);
	Enrollments.add(E30);
	Enrollments.add(E31);
	Enrollments.add(E32);
	Enrollments.add(E33);
	Enrollments.add(E34);
	Enrollments.add(E35);
	Enrollments.add(E36);
	Enrollments.add(E37);
	Enrollments.add(E38);
	Enrollments.add(E39);
	Enrollments.add(E41);
	Enrollments.add(E42);
	Enrollments.add(E43);
	Enrollments.add(E44);
	Enrollments.add(E45);
	Enrollments.add(E46);
	Enrollments.add(E47);
	Enrollments.add(E48);
	Enrollments.add(E49);
	Enrollments.add(E50);
	Enrollments.add(E51);
	Enrollments.add(E52);
	Enrollments.add(E53);
	Enrollments.add(E54);
	Enrollments.add(E55);
	Enrollments.add(E56);
	Enrollments.add(E57);
	Enrollments.add(E58);
	Enrollments.add(E59);
	Enrollments.add(E60);
	
	/*
	public int GPA(UUID studentID) {
		int total = 0;
		int count = 0;
		for(Enrollment e : Enrollments) {
			if (e.getStudentID() == studentID) {
				total += e.getGrade();
				count++;
			}
		}
		total = total / count;
		return total;
	}
	
*/
	/*
	public int courseAverage(UUID sectionID) {
		int total = 0;
		int count = 0;
		for(Enrollment e : Enrollments) {
			if (e.getSectionID() == sectionID) {
				total += e.getGrade();
				count++;
			}
		}
		total = total / count;
		return total;
		
	}
	*/
	}

	@Test
	public void testGPA() {
	}
	
	@Test
	public void testCourse() {
		
	}

}
