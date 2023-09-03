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
        
    }
}
