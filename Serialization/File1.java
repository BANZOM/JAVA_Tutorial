package Serialization;

import java.io.*;

/*
 * To enable serialization for a Java class, 
 * it must implement the Serializable interface. 
 * This interface doesn't have any methods; 
 * it serves as a marker interface to indicate that objects of the class can be serialized.
 */

public class File1 {
    public static void main(String[] args) {

        TestSerialization obj = new TestSerialization();

        // Try to write serialized data of class TestSerialization to a file named "TestSerialization.ser".
        try {
            // Create a FileOutputStream object to write to the file Serialization/TestSerialization.ser"
            FileOutputStream fileOut = new FileOutputStream("Serialization/TestSerialization.ser");

            // Create an ObjectOutputStream object to write objects to the FileOutputStream
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            // Write the object `obj` to the ObjectOutputStream
            out.writeObject(obj);

            // Close the ObjectOutputStream and FileOutputStream
            out.close();
            fileOut.close();

            // Print a success message and the serialized object
            System.out.println("Serialized data is saved in Serialization/TestSerialization.ser");
            System.out.println(obj);

            // Print the values of the variables `a` and `b` in the serialized object
            System.out.println(obj.a + " " + obj.b);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reads an object of the class TestSerialization from a file named "TestSerialization.ser".
        try {
            FileInputStream fileIn = new FileInputStream("Serialization/TestSerialization.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // Read the serialized object and cast it to the TestSerialization class
            TestSerialization obj1 = (TestSerialization) in.readObject();

            // Close the ObjectInputStream and FileInputStream
            in.close();
            fileIn.close();

            System.out.println("Deserialized data is fetched from Serialization/TestSerialization.ser");
            System.out.println(obj1);

            // Print the values of the variables a and b in the deserialized object
            System.out.println(obj1.a + " " + obj1.b);
            System.out.println(obj1.c.getVar1()); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}