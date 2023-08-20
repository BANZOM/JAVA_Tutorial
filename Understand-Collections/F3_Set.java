import java.util.Set;
import java.util.HashSet;

public class F3_Set {
    public static void main(String[] args) {
        
        Set <Integer> set = new HashSet<Integer>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(3);

        // It doesn't store the duplicates
        System.out.println(set);
        System.out.println(set.size());

    }
}
