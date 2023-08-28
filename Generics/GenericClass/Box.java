package Generics.GenericClass;
import java.util.*;

public class Box<T> {
    private List<T> items;

    public Box() {
        this.items = new ArrayList<>();
    }

    public T getLatestitems() {
        return this.items.get(this.items.size() - 1);
    }

    public int getCountOfitems() {
        return this.items.size();
    }

    public List<T> getItems() {
        return items;
    }
    
}
