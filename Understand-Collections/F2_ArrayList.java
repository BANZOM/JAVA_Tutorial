import java.util.ArrayList;
import java.util.List;

public class F2_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        // al.add(1);
        // al.add(2);
        // al.add(3);
        // for (Integer i : al) {
        //     System.out.println(i);
        // }


        // List have many extra useful methods 
        List<String> l = new ArrayList<>();

        l.add(0, "null");  // [null]
        l.add(1, "null");  // [null, null]
        l.add(1, "Aditya");  // [null, Aditya, null]

        System.out.println(l); // [null, Aditya, null]
    }
}
