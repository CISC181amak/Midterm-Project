package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Student extends Person {

	private eMajor Major;
	private UUID ID;
	
	public eMajor getMajor ( )
    {
        return this.Major;
    }
    public void setMajor (eMajor Major)
    {
        this.Major = Major;           
    }
    
    public UUID getID()
    { return this.ID; }
    
	public Student(String FirstName, String MiddleName, String LastName,Date DOB, eMajor Major,
			String Address, String Phone_number, String Email) throws PersonException 
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
		this.Major = Major;
		this.ID = UUID.randomUUID();
		
	}
	
	@Override
	public void PrintName() {
		System.out.println(getLastName() + ","  + getFirstName() + ' ' + getMiddleName());
	}

	public void PrintName(boolean bnormal)
	{
		super.PrintName();
	}
}