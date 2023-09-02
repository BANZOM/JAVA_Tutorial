package IO;

import java.io.FileWriter;
import java.io.IOException;

public class Writer2 {
    public static void main(String[] args) {
        
        try {
            FileWriter fileWriter = new FileWriter("IO/fileWrite1.txt");
            fileWriter.write("Hello World from fileWrite1.txt");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
