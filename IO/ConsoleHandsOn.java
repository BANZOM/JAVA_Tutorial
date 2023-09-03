package IO;

import java.io.Console;

public class ConsoleHandsOn {
    public static void main(String[] args) {
        Console console = System.console();
        char[] ch;

        ch = console.readPassword("%s","Enter Password: ");

        
        
    }
}
