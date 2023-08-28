package Generics;
import java.util.*;

public class With_Generic {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add(new String("B"));

        someOperation(list);
    }

    private static void someOperation(List<String> list) {
        String s = list.get(0);
        System.out.println(s);
    }
}
