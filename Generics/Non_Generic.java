package Generics;
import java.util.*;
public class Non_Generic {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(123);
        
        String value = new String("B");
        list.add(value);

        someOperation(list);
        
    }

    private static void someOperation(List list) {
        String s = (String) list.get(0);
        System.out.println(s);
    }
}
