package com.day3.collegeregistration;

import java.util.List;

public class Student
{
	static int count =100;
	private String studentId;
	private String studentName;
	private String studentEmail;
	static String CollegeName="Zettamine";
	
	public Student(String studentName, String studentEmail)
	{
		super();
		this.studentId="Zetta_"+(++count);
		this.studentName = studentName;
		this.studentEmail = studentEmail;
	}
	public static void getDetails(List<Student> stuList)
	{
		for (Student student : stuList) {
			
			System.out.printf("%-10s | %-20s | %-20s |%-10s",student.studentId, student.studentName,student.studentEmail,student.CollegeName);
		}
		System.out.println();
	}
	}
