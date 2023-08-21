import java.util.*;
import java.util.stream.Stream;

public class Stream_Usuage {
    public static void main(String[] args) {
        // Understanding Stream

        List<Integer> list = Arrays.asList(1, 3, 2, 4, 5, 3, 6, 4, 3, 6, 32, 53, 12, 43, 52, 2);

        Stream<Integer> stream = list.stream();
        // using stream to find filter only even nums;
        Stream<Integer> stream1 = stream.filter(i -> i % 2 == 0);
        // stream1.forEach(i -> System.out.print(i + ", "));

        // using map to find square of even nums
        Stream<Integer> stream2 = stream1.map(i -> i * i);
        stream2.forEach(i -> System.out.print(i + ", "));

        

    }
}
