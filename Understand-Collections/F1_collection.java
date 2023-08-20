import java.util.ArrayList;
import java.util.Collection;

class F1_collection {
    public static void main(String[] args) {
        /*
         * Collection -> Interface
         * Collections -> Class
         * Collection API -> concept
        */

        Collection c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);

        System.out.println(c);  // but we dont know what is the type of c
        

        
    }
}