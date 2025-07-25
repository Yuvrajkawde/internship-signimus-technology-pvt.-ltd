package com.IOStreamExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileCopy {
    public static void main(String[] args) {
        String sourcePath = "source.jpg";       // Replace with your source file path
        String destinationPath = "D:\\copy.jpg";    // Replace with your destination file path

        try (
                FileInputStream fis = new FileInputStream(sourcePath);
                FileOutputStream fos = new FileOutputStream(destinationPath)
        ) {
            byte[] buffer = new byte[1024];  // Buffer to hold chunks of bytes
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
