package com.day6.studentdata;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) 
        {
            students[i] = new Student();
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            students[i].acceptData();
        }

        studentDataSave(students);
        
        
        for (Student student : students) 
        {
            student.displayData();
            System.out.println();
        }
    }

    public static void studentDataSave(Student[] students) 
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("StudentData.txt"))) 
        {
            for (Student student : students) {
                writer.write("Roll No.: " + student.getRollNo() + "\n");
                writer.write("Student Name: " + student.getStdName() + "\n");
                writer.write("Subject Marks (Normal Order): " + student.getSubjectMarksHS() + "\n");
                writer.write("Subject Marks (Sorted Order): " + student.getSubjectMarksTS() + "\n");
                writer.write("\n");
            }
            System.out.println("Student data saved to StudentData.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
