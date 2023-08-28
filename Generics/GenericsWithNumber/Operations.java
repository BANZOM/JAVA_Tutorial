package Generics.GenericsWithNumber;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Operations <N extends Number & Comparable<N>> {
    List<N> list;

    public Operations(List<N> list) {
        this.list = list;
    }

    public List sort() {
        Collections.sort(this.list);
        return this.list;
    }
}
