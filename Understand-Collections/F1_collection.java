import java.util.ArrayList;
import java.util.Collection;

class F1_collection {
    public static void main(String[] args) {
        /*
         * Collection -> Interface
         * Collections -> Class
         * Collection API -> concept
        */

        // Collection only works with objects not primitive types i.e int,etc;
        Collection<Integer> c = new ArrayList<Integer>();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);

        for (Integer i : c) {
            System.out.println(i);
        }
        

        
    }
}