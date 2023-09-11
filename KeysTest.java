import java.util.SortedMap;
import java.util.TreeMap;

public class KeysTest {
    public static void main(String[] args) {
        
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("1","one");
        treeMap.put("2","two");
        treeMap.put("3","three");
        treeMap.put("4","four");
        treeMap.put("5","five");
        treeMap.put("6","six");

        System.out.println(treeMap.keySet());          // [1, 2, 3, 4, 5, 6]
        System.out.println(treeMap.values());         // [one, two, three, four, five, six]

        System.out.println(treeMap.higherKey("3"));     // 4
        System.out.println(treeMap.lowerKey("3"));      // 2
        System.out.println(treeMap.floorKey("3"));      // 3
        System.out.println(treeMap.ceilingKey("3"));    // 3

        System.out.println(treeMap.firstKey());        // 1

        SortedMap<String, String> sortedMap = new TreeMap<>(treeMap);
        System.out.println(sortedMap.keySet());      // [1, 2, 3, 4, 5, 6]
        System.out.println(sortedMap.values());     // [one, two, three, four, five, six]
    }
}
