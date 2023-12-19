package com.day5;

import java.io.IOException;
import java.nio.file.*;

public class CopyCommand {

    public static void main(String[] args) {
        // Check if source and destination are provided
        if (args.length < 2) {
            System.out.println("Usage: java CopyCommand <source> <destination>");
            System.exit(1);
        }

        String sourcePath = args[0];
        String destinationPath = args[1];

        try {
            // Perform the file copy
            copyFile(sourcePath, destinationPath);
            System.out.println("Copy successful.");
        } catch (IOException e) {
            System.out.println("Copy failed: " + e.getMessage());
        }
    }

    private static void copyFile(String sourcePath, String destinationPath) throws IOException {
        // Resolve file paths
        Path source = Paths.get(sourcePath).toAbsolutePath().normalize();
        Path destination = Paths.get(destinationPath).toAbsolutePath().normalize();

        // Check if source file exists
        if (!Files.exists(source)) {
            throw new IOException("Source file does not exist: " + sourcePath);
        }

        // Check if the source is a directory
        if (Files.isDirectory(source)) {
            throw new IOException("Source must be a file, not a directory: " + sourcePath);
        }

        // Copy the file
        Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
    }
}
