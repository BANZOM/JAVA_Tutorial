package InputTaking;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Taking the Input
 * 1. using BufferReader
 * 2. using Scanner
 */
public class Main1 {
    public static void main(String[] args) throws IOException {
        
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader rf = new BufferedReader(in);

        // int i = Integer.parseInt(rf.readLine()); // returns String
        // System.out.println("Given input: "+ i);


        // rf.close();


        // scanner
        Scanner rS = new Scanner(System.in);
        String i = rS.nextLine();
        int j = rS.nextInt();
        System.out.println("Given input: "+ i +" " +j); 

        rS.close();
    }
}
