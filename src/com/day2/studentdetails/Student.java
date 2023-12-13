package com.day2.studentdetails;

import java.util.Scanner;

import lombok.Getter;
@Getter
class Student 
{
	//Declare the instance variable as private for security
	
    private int studentId;
    private String studentName;
    private String studentAddress;
    private String collegeName;

    // 3-argument constructor for NIT students
    public Student(int studentId, String studentName, String studentAddress) 
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = "NIT";
    }

    // 4-argument constructor for non-NIT students
    public Student(int studentId, String studentName, String studentAddress, String collegeName) 
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = collegeName;
    }

    // Show all the details of student
	public void studentDetails() 
	{
		System.out.println("Student id: " + studentId);
        System.out.println("Student name: " + studentName);
        System.out.println("Address: " + studentAddress);
        System.out.println("College Name: " + collegeName);
     }
}