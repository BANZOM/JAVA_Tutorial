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
        Collection c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);

        // works but highly prone to runtime exceptions
        for (Object i : c) {
            int num = (int) i;
            System.out.println(num);
        }
        

        
    }
}