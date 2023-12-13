package com.day5;

import java.io.File;
import java.io.IOException;

public class DirectoryAndFileCreation 
{

	public static void main(String[] args) 
	{
        // Specify the base directory
        String baseDirectoryPath = "C:/CJava";

        // Specify the sub-directory name
        String subDirectoryName = "java";

        // Specify the file name
        String fileName = "java.txt";

        // Create a File object for the base directory
        File baseDirectory = new File(baseDirectoryPath);

        // Create the base directory if it does not exist
        if (!baseDirectory.exists()) 
        {
            boolean created = baseDirectory.mkdir();
            if (created) 
            {
                System.out.println("Base directory created successfully.");
            } else 
            {
                System.out.println("Failed to create base directory.");
                return; // Exit if base directory creation fails
            }
        }

        // Create a File object for the sub-directory
        File subDirectory = new File(baseDirectory, subDirectoryName);

        // Create the sub-directory if it does not exist
        if (!subDirectory.exists()) 
        {
            boolean created = subDirectory.mkdir();
            if (created) 
            {
                System.out.println("Sub-directory created successfully.");
            } else 
            {
                System.out.println("Failed to create sub-directory.");
                return; // Exit if sub-directory creation fails
            }
        }

        // Create a File object for the new file within the sub-directory
        File newFile = new File(subDirectory, fileName);

        try 
        {
            // Create the new file
            boolean created = newFile.createNewFile();
            if (created)
            {
                System.out.println("File created successfully: " + newFile.getAbsolutePath());
            } else 
            {
                System.out.println("Failed to create the file.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }
    }
}
