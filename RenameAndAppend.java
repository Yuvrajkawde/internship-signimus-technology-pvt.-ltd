package com.IOStreamExample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RenameAndAppend {
    public static void main(String[] args) {
        // Step 1: Original file
        File originalFile = new File("sample.txt");

        // Step 2: New file name (renamed)
        File renamedFile = new File("renamed_sample.txt");

        // Step 3: Rename the file
        if (originalFile.renameTo(renamedFile)) {
            System.out.println("File renamed successfully to " + renamedFile.getName());

            // Step 4: Append content to the renamed file
            try (FileWriter writer = new FileWriter(renamedFile, true)) { // 'true' means append mode
                writer.write("\nThis content was appended after renaming.");
                System.out.println("Content appended successfully.");
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }

        } else {
            System.out.println("File rename failed.");
        }
    }
}

