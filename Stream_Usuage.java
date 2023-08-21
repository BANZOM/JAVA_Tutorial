import java.util.*;
import java.util.stream.Stream;

public class Stream_Usuage {
    public static void main(String[] args) {
        // Understanding Stream

        List<Integer> list = Arrays.asList(1, 3, 2, 4, 5, 3, 6, 4, 3, 6, 32, 53, 12, 43, 52, 2);

        // doing the previous operation in reduced syntax
        int sum = list.stream().filter(i -> i%2 == 0).map(i -> i*i).reduce(0,(i,j) -> i+j);
        System.out.println(sum);

        

    }
}
