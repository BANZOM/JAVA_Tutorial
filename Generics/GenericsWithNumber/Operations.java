package Generics.GenericsWithNumber;

import java.util.List;

public class Operations <N extends Number> {
    List<N> list;

    public Operations(List<N> list) {
        this.list = list;
    }
    
}
