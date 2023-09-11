import java.util.TreeMap;

public class KeysTest {
    public static void main(String[] args) {
        
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("one", "1");
        treeMap.put("two", "2");
        treeMap.put("three", "3");
        treeMap.put("four", "4");
        treeMap.put("five", "5");

        System.out.println(treeMap.keySet());
        System.out.println(treeMap.values());

    }
}
