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

        System.out.println(treeMap.keySet());
        System.out.println(treeMap.values());

        System.out.println(treeMap.higherKey("3"));
    }
}
