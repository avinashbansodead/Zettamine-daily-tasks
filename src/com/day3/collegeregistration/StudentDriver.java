package com.day3.collegeregistration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDriver
{
	
	public static void main(String[] args) 
	{
	   Scanner sc= new Scanner(System.in);
	    int noOfAdmissions = 100;
	   
	    String collegeName= "Zetta-";

	        List<Student> stulist = new ArrayList <Student>();
	       
	        for(int i =0; i<noOfAdmissions; i++) 
	        {
	        System.out.println("Enter student name and email: ");
	        String name = sc.next();
	        String email = sc.next();
	        stulist.add(new Student( name, email));
	        System.out.println("Do you want to add more students?[Y/N]");
	        String decision = sc.next();
	        
	        if(decision.equals("Y")) 
	        {
	        noOfAdmissions = noOfAdmissions+1;
	        }
	        else 
	        {      
	       Student.getDetails(stulist);
	        }
	        
	        
	
}
	}
}
    
