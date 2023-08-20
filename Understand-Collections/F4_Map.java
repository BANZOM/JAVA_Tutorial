import java.util.*;
public class F4_Map {
    public static void main(String[] args) {
        /*
         * Map is not an implementation or it does not extend the collection interface.
         * But it is a part of the collection concept.
         * - Map is a collection of key-value pairs. in this, for every value of an
         * element, a key is associated with it.
         * - Map itself is in an interface that supports key-value pairs. A class that
         * implements it is called HashMap.
         * 
         */

        Map <String, String> map = new HashMap<>();
        // We can use the put() method to add a key-value pair to the map
        map.put("Name", "Aditya");
        map.put("Age", "20");
        map.put("Gender", "Male");

        System.out.println(map);

        // Iterating through the map

        for(String k : map.keySet()) {
            System.out.println("Key: " + k + "\t Value: " + map.get(k));
        }
    }
}
