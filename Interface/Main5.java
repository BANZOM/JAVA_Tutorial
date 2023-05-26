package Interface;
/*
 * The Lamda Expression (->) used with functional interface
 */

@FunctionalInterface
interface LE1{
    void display();
}

@FunctionalInterface
interface LE2{
    void sumOfTwo(int x, int y);
}

public class Main5 {
    public static void main(String[] args) {

        LE1 x = () -> {
            System.out.println("printing with the help of Lamda Expression...");
        };

        x.display();
        
        LE2 y = (int i, int j) -> {
            System.out.println("Sum of two numbers: " + (i+j));
        };

        y.sumOfTwo(10,20);
    }
}
