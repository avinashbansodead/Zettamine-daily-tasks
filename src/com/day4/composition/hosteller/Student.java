package com.day4.composition.hosteller;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
class Student 
{
	static Scanner sc= new Scanner(System.in);
    protected int studentId;
    protected String name;
    protected int departmentId;
    protected String gender;
    protected String phone;
    Hosteller hosteller;

    // Constructor
    public Student(int studentId, String name, int departmentId, String gender, String phone, String hostelName, int roomNumber) 
    {
        this.studentId = studentId;
        this.name = name;
        this.departmentId = departmentId;
        this.gender = gender;
        this.phone = phone;
        this.hosteller = new Hosteller(hostelName, roomNumber);
    }

	public void modifyDetails()
	{
		 System.out.print("Modify Phone Number(Y/N): ");
	        char modifyPhone = sc.next().charAt(0);

	        if (modifyPhone == 'Y' || modifyPhone == 'y')
	        {
	            System.out.print("New Phone Number: ");
	            String newPhone=sc.nextLine();
	            setPhone(newPhone);
	          sc.nextLine();
	        }
	        
	        System.out.print("Modify Room Number(Y/N): ");
	        char modifyRoom = sc.next().charAt(0);

	        if (modifyRoom == 'Y' || modifyRoom == 'y')
	        {
	            System.out.print("New Room Number: ");
	            int newRoomNo=sc.nextInt();
	            hosteller.setRoomNumber(newRoomNo);
	           
	        }
	        	displayStudentDetails();
}

	private void displayStudentDetails() 
	{
		System.out.println("\nThe Student Details are as follows:");
        System.out.println("Student ID: " + getStudentId());
        System.out.println("Student Name: " + getName());
        System.out.println("Department ID: " + getDepartmentId());
        System.out.println("Student Gender: " + getGender());
        System.out.println("Student Phone No: " + getPhone());
        System.out.println("Hostel Name: " + hosteller.getHostelName());
        System.out.println("Room No: " + hosteller.getRoomNumber());
    }
		
	

}
