
package com.tasks.day_1;

import java.util.Scanner;

public class StringConcatination 
{
    public static void main(String[] args) 
    {
    	//Create scanner class object
        Scanner sc = new Scanner(System.in);

        // Input Inmate's name
        System.out.print("Inmate's name: ");
        String inmateName = sc.nextLine();

        // Input father's name
        System.out.print("Inmate's father's name: ");
        String fatherName = sc.nextLine();
       
        //close the scanner object.
        sc.close();
        
        // Validate inmateName and fatherNamee
       Boolean inmateAns=isValidName(inmateName);
        Boolean fatherAns=isValidName(fatherName);
        
        //check both validation are true and generate concated String
        if(inmateAns==true && fatherAns==true)
        {
        	String concateString=concatinationAndUpperCase(inmateName,fatherName);
        	System.out.println(concateString);
        }
        else
        {
        	System.err.println("Invalid name");
        }
       
    }
    private static boolean isValidName(String name)
    {
        // Check if the name contains only alphabets and space
    	Boolean ans=name.matches("^[a-zA-Z ]+$");
        return ans;
    }

    private static String concatinationAndUpperCase(String inmateName, String fatherName) 
    {
        //Concatination and upper case conversion of string
        String concateString = inmateName.toUpperCase() + " " + fatherName.toUpperCase();
        return concateString;
    }

  
}

