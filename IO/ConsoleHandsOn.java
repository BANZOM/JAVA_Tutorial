package IO;

import java.io.Console;

public class ConsoleHandsOn {
    public static void main(String[] args) {
        Console console = System.console();
        char[] ch;

        ch = console.readPassword("%s","Enter Password: ");  // this allows the user to enter password that is hidden while typing

        for (char c: ch) {
            console.format("%s ", c);  // this is printing that password characters
        }
        console.format("\n");


        String str = console.readLine("Enter: ");  // this allows the user to enter any text, it is visible
        console.format("Output is %s\n", str);  // this is just an alternative to System.out.println
        
        
    }
}
