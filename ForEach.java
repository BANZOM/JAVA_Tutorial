import java.util.*;
import java.util.function.Consumer;

/**
 * The `ForEach` class demonstrates different ways to iterate over a list of integers and print its elements using various looping constructs in Java.
 */
public class ForEach {
    
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,2,3,6,5,3,21,8);

        // Prining by normal loop:
        for(int i=0; i<list.size(); i++)
            System.out.print(list.get(i) + ", ");
        System.out.println("\n-------------");


        // Prining by Enhanced loop
        for(int i: list)
            System.out.print(i + ", ");
        System.out.println("\n-------------");


        // Prining by ForEach  {it is consumer that is written in lambda expression}
        list.forEach(i -> System.out.print(i + ", "));
        System.out.println("\n-------------");


        // Getting the actual concept behind forEach i.e Consumer
        Consumer<Integer> consumer = new Consumer<Integer>() {
            public void accept(Integer i) {
                System.out.print(i + ", ");
            }
            
        };
        System.out.print("From Consumer: ");
        list.forEach(consumer);
        System.out.println("\n-------------");

    }
}
