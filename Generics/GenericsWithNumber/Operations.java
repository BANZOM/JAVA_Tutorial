package Generics.GenericsWithNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Operations <N extends Number & Comparable<N>> {
    private List<N> list;

    public Operations(List<N> list) {
        this.list = new ArrayList<>(list);
    }

    public List<N> sort() {
        Collections.sort(this.list);
        return this.list;
    }

    public N getMax() {
        return Collections.max(this.list);
    }
}
