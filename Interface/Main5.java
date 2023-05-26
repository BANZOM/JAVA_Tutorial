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

@FunctionalInterface
interface LE3{
    int sumOfTwo(int x, int y);
}

public class Main5 {
    public static void main(String[] args) {

        LE1 x = () -> {
            System.out.println("printing with the help of Lamda Expression...");
        };

        x.display();
        
        LE2 y = (int i, int j) -> {
            System.out.println("Sum of two numbers with y object: " + (i+j));
        };

        y.sumOfTwo(10,20);

        LE2 z = (i,j) -> {
            System.out.println("Sum of two numbers with z object: " + (i+j));
        };

        z.sumOfTwo(40,55);

        LE3 a = (i,j) -> {
            return (i+j);
        };
        int ans = a.sumOfTwo(11, 12);
        System.out.println("Sum of number with LE3: "+ ans);
    }
}
