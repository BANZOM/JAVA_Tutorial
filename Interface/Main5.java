package Interface;
/*
 * The Lamda Expression (->) used with functional interface
 */

@FunctionalInterface
interface LE{
    void display();
}

public class Main5 {
    public static void main(String[] args) {

        LE x = () -> {
            System.out.println("printing with the help of Lamda Expression...");
        };

        x.display();
        
    }
}
