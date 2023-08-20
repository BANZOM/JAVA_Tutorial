import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class F3_Set {
    public static void main(String[] args) {
        // Set extends collection but the class which implements set is different and the class name is HashSet.
        // Instead of using the class HashSet, if we will use the TreeSet, it will give values in sorted order.
        Set <Integer> set = new HashSet<Integer>();

        set.add(2);
        set.add(1);
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(3);

        // It doesn't store the duplicates
        System.out.println(set);
        System.out.println(set.size());
        System.out.println("------------");

        // Printing through Iterator
        Iterator<Integer> I = set.iterator();

        while (I.hasNext()) {
            System.out.println(I.next());
        }

    }
}
