package com.day2.studentdetails;

import java.util.Scanner;

public class StudentDriver 
{
    public static void main(String[] args) 
    {
    	//Create Scanner class object for taking the inputs from user.
        Scanner sc = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter Student's Id: ");
        int studentId = sc.nextInt();
        
        //Move the cursor to the new line
        sc.nextLine(); 

        System.out.print("Enter Student's Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Student's address: ");
        String studentAddress = sc.nextLine();

        //Check weather the user is from NIT college or not
        System.out.print("Whether the student is from NIT(Yes/No): ");
        String ans = sc.nextLine();
       
        //Iterate the loop till user enters the wrong inputs
        while (!ans.equalsIgnoreCase("yes")&& !ans.equalsIgnoreCase("no")) 
        {
            System.out.println("Wrong Input");
            System.out.print("Whether the student is from NIT(Yes/No): ");
            ans = sc.nextLine();
        }

        Student student;
        
        // If student is from NIT college then three argument constructor is called 
        if (ans.equalsIgnoreCase("yes")) 
        {
            student = new Student(studentId, studentName, studentAddress);
          student. studentDetails();
        } 
        // If student is not from NIT college then four argument constructor is called
        else 
        {
            System.out.print("Enter the college name: ");
            String collegeName = sc.nextLine();
            student = new Student(studentId, studentName, studentAddress, collegeName);
            student. studentDetails();
        }
        
        // Close the scanner object
        sc.close();
    }
}