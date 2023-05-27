package InputTaking;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Taking the Input
 * 1. using BufferReader
 * 2. using Scanner
 */
public class Main1 {
    public static void main(String[] args) throws IOException {
        
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader rf = new BufferedReader(in);

        int i = rf.read(); // returns ASCII VAlues
        System.out.println(i); 
    }
}