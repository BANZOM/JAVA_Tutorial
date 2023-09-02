package IO;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("IO/fileWrite1.txt"));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
