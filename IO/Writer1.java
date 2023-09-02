package IO;
import java.io.File;
import java.io.IOException;

public class Writer1 {
    public static void main(String[] args) {

        // Code snipped to create new file
        File file = new File("IO/fileWrite1.txt");
        System.out.println(file.exists());

        try {
            boolean newFile = file.createNewFile();
            // System.out.println(newFile);

        }
        catch (IOException e) {
            System.out.println("Unable to create file");
        }

    }
}
