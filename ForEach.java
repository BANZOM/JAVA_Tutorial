import java.util.*;

public class ForEach {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,2,3,6,5,3,21,8);

        // Prining by normal loop:
        for(int i=0; i<list.size(); i++)
            System.out.print(list.get(i) + ", ");
        System.out.println("\n-------------");

    }
}
