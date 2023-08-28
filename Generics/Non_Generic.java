package Generics;
import java.util.*;
public class Non_Generic {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(123);
        
        String value = new String("B");
        list.add(value);

        someOperation(list);
        /*
         * without generic: 
         * 1. Explicit cast
         * 2. Type safety
         */
    }

    private static void someOperation(List list) {
        String s = (String) list.get(0);  // raise exception if in case of type mismatch
        System.out.println(s);
    }
}
