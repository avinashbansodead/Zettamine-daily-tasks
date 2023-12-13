package com.day5;

import java.io.File;

public class RenameCommand
{
    public static void main(String[] args) 
    {
        // Check if correct number of arguments is provided
        if (args.length != 3) 
        {
            System.out.println("Usage: java RenameCommand <sourcePath> <newName> <isDirectory>");
            System.exit(1);
        }

        // Get command-line arguments
        String sourcePath = args[0];
        String newName = args[1];
        boolean isDirectory = Boolean.parseBoolean(args[2]);

        // Create a File object for the source file or directory
        File sourceFile = new File(sourcePath);

        // Check if the source file or directory exists
        if (!sourceFile.exists())
        {
            System.out.println("Source file or directory does not exist.");
            System.exit(1);
        }

        // Create a File object for the destination file or directory with the new name
        File destFile = new File(sourceFile.getParent(), newName);

        // Rename the source file or directory
        boolean success;
        if (isDirectory) 
        {
            success = sourceFile.renameTo(destFile);
        } else 
        {
            // For renaming files, we need to consider the file extension as well
            String destPath = sourceFile.getParent() + File.separator + newName;
            success = sourceFile.renameTo(new File(destPath));
        }

        // Check if the renaming operation was successful
        if (success)
        {
            System.out.println("Renaming successful.");
        } else 
        {
            System.out.println("Failed to rename. Make sure the destination name is unique.");
        }
    }
}
