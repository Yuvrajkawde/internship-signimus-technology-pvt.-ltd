package com.IOStreamExample;

import java.io.File;
import java.io.IOException;

public class AdvancedFileOperation {

    public static void main(String[] args) throws IOException {
        File file = new File("example2.txt");

        if (file.createNewFile()){
            System.out.println("file created successfully :" + file.getName());
        }
        else {
            System.out.println("file already exist");
        }
//        if (file.delete()){
//            System.out.println("file deleted successfully :" + file.getName());
//        }
//        else {
//            System.out.println("file not exist");
//        }
        File oldFile = new File("example.txt");
        File newFile = new File("new_example.txt");
        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed successfully.");
        } else {
            System.out.println("Failed to rename the file.");
        }

    }
}
