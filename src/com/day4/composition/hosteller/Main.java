package com.day4.composition.hosteller;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Student Details & Hostel Details:");

        // Input for Student details
        System.out.print("Student ID: ");
        int studentId = scanner.nextInt();
        
        scanner.nextLine();  // consume the newline
        System.out.print("Student Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Department Id: ");
        int departmentId = scanner.nextInt();
        scanner.nextLine();  // consume the newline
        
        System.out.print("Gender[M/F]: ");
        String gender = scanner.nextLine();
        
        System.out.print("Phone Number: ");
        String phone = scanner.nextLine();

        // Input for Hostel details
        System.out.print("Hostel Name: ");
        String hostelName = scanner.nextLine();
        
        System.out.print("Room Number: ");
        int roomNumber = scanner.nextInt();
        
        scanner.nextLine();  // consume the newline

       Student student= new Student(studentId,name,departmentId,gender,phone,hostelName,roomNumber);
       student.modifyDetails();
    }

}