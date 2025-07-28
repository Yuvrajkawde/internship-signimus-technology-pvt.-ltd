package com.IOStreamExample;

import java.io.*;

public class StudentSerialization {
    public static void main(String[] args) {
        String filePath = "student.ser";

        // Step 1: Create Student object
        Student student = new Student("Yuvraj", 90);

        // Step 2: Serialize the object to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(student);
            System.out.println("Student object serialized successfully to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Step 3: Deserialize the object from the file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Student Studentdeserialize = (Student) ois.readObject();
            System.out.println("Deserialized Student object:");
            System.out.println(Studentdeserialize);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
