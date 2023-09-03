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
        
        // Writes an object of the class TestSerialization to a file named "TestSerialization.ser".
        try {
            FileOutputStream fileOut = new FileOutputStream("Serialization/TestSerialization.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
 }