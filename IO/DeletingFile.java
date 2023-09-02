package IO;

import java.io.File;

public class DeletingFile {
    public static void main(String[] args) {
        File file = new File("IO/fileWrite1.txt");

        if(file.exists()) {
            file.delete();
            System.out.println("Successfully Deleted");
        }
        else {
            System.out.println("File don't Exist.");
        }
    }
}
