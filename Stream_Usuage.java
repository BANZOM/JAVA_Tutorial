import java.util.*;
import java.util.stream.Stream;

public class Stream_Usuage {
    public static void main(String[] args) {
        // Understanding Stream

        List<Integer> list = Arrays.asList(1,3,2,4,5,3,6,4,3,6,32,53,12,43,52,2);

        Stream<Integer> stream = list.stream();
        System.out.println(stream.count());
        // System.out.println(stream.findAny());  // error due to it cannot be reused
        
    }
}
