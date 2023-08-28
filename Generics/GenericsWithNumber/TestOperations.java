package Generics.GenericsWithNumber;

import java.util.List;

public class TestOperations {
    public static void main(String[] args) {
        List<Long> list = List.of(2L, 4L, 5L, 1L, 3L);
        
        Operations<Long> longList = new Operations<>(list);

        System.out.println(longList.getMax());
        System.out.println(longList.sort());
    }
}
