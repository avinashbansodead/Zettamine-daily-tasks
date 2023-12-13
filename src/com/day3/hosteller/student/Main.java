package com.day3.hosteller.student;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
        Hosteller hos = new Hosteller();

        System.out.println("Enter the Student Details & Hostel Details:");
        
        System.out.print("Student ID: ");
        int studentId=sc.nextInt();
        hos.setStudentId(studentId);
        //sc.nextLine(); // Consume the newline character
        
        System.out.print("Student Name: ");
        String studentName=sc.nextLine();
        hos.setName(studentName);

        System.out.print("Department Id: ");
        int deptId=sc.nextInt();
        hos.setDepartmentId(deptId);
        sc.nextLine(); // Consume the newline character
        
        System.out.print("Gender[M/F]: ");
        String gender=sc.nextLine();
        hos.setGender(gender);

        System.out.print("Phone Number: ");
        String phoneNo=sc.nextLine();
        hos.setPhone(phoneNo);

        System.out.print("Hostel Name: ");
        String hostelName=sc.nextLine();
        hos.setHostelName(hostelName);

        System.out.print("Room Number: ");
        int roomNo=sc.nextInt();
        hos.setRoomNumber(roomNo);
       // Consume the newline character
        
        System.out.print("Modify Room Number(Y/N): ");
        String roomAns=sc.nextLine();
        
        if (roomAns.equalsIgnoreCase("Y")) 
        {
            System.out.print("New Room Number: ");
            int newRoomNo=sc.nextInt();
            hos.setRoomNumber(newRoomNo);
        }

        sc.nextLine(); // Consume the newline character
        System.out.print("Modify Phone Number(Y/N): ");
        String phoneAns=sc.nextLine();
        if (phoneAns.equalsIgnoreCase("Y"))
        {
            System.out.print("New Phone Number: ");
            String newPhoneNo=sc.nextLine();
            hos.setPhone(newPhoneNo);
            
             
        }

        getStudentDetails(hos);
    }

	

	public static void getStudentDetails(Hosteller hos) 
	{
        System.out.println("The Student Details are as follows:");
        System.out.println("Student ID: " + hos.getStudentId());
        System.out.println("Student Name: " + hos.getName());
        System.out.println("Department ID: " + hos.getDepartmentId());
        System.out.println("Student Gender: " + hos.getGender());
        System.out.println("Phone Number: " + hos.getPhone());
        System.out.println("Hostel Name: " + hos.getHostelName());
        System.out.println("Room No: " + hos.getRoomNumber());
    }
}

