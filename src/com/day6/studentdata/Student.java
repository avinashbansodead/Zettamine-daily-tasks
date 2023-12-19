package com.day6.studentdata;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Student
{
    private int rollNo;
    private String stdName;
    private Set<Integer> subjectMarksHS;
    private Set<Integer> subjectMarksTS;

    public Student() 
    {
        subjectMarksHS = new HashSet<>();
        subjectMarksTS = new TreeSet<>();
    }

    public void acceptData() 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No.: ");
        rollNo = sc.nextInt(); 
        sc.nextLine(); // Consume newline
        
        System.out.print("Enter Student Name: ");
        stdName = sc.nextLine();

        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        for (int i = 0; i < numSubjects; i++)
        {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            int marks = sc.nextInt();
            subjectMarksHS.add(marks);
            subjectMarksTS.add(marks);
        }
    }

    public void displayData()
    {
        System.out.println("Roll No.: " + rollNo);
        System.out.println("Student Name: " + stdName);
        System.out.println("Subject Marks (Normal Order): " + subjectMarksHS);
        System.out.println("Subject Marks (Sorted Order): " + subjectMarksTS);
    }
}

