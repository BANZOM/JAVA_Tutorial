package IO;
import java.io.File;
import java.io.IOException;

public class Writer1 {
    public static void main(String[] args) {
        File file = new File("IO/fileWrite1.txt");
        System.out.println(file.exists());

    }
}
