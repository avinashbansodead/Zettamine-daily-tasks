package com.day6.studentreport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudentByLocation
{
    public static void main(String[] args)
    {
        String name;
        String location;
        String email;
        long mobile;
        
        Scanner sc = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        while (true)
        {
            System.out.println("Enter Student's Name, Location, Email and Mobile:");
            name=sc.next();
            location = sc.next();
            email = sc.next();
            mobile = sc.nextLong();
            
            Student student = new Student(name, location, email, mobile);
            studentList.add(student);
            
            System.out.print("Do you want to add more students[Y/N]: ");
            
            char option = sc.next().charAt(0);
            if(!(option=='y'||option=='Y'))break;
        }
        
        System.out.println("Location - Count");
        for ( Map.Entry<String,Integer>entry : StudentByLocation.getReport(studentList).entrySet() ) 
        {
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }
        
        sc.close();
    }
    
    public static HashMap<String, Integer> getReport(List<Student>studentlist)
    {
        HashMap<String,Integer> studentReport = new HashMap<>();
        
        for (Student student : studentlist)
        {
            studentReport.put(student.getLocation(), studentReport.getOrDefault(student.getLocation(), 0)+1);
        }
        return studentReport;
    }
}