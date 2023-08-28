package Generics.GenericClass;
import java.util.*;

/**
 * Represents a box containing items of type T.
 * 
 * @param <T> the type of items stored in the box
 */
public class Box<T> {
    private List<T> items;

    /**
     * Constructs an empty box.
     */
    public Box() {
        this.items = new ArrayList<>();
    }

    /**
     * Returns the latest item added to the box.
     * 
     * @return the latest item added to the box
     */
    public T getLatestitems() {
        return this.items.get(this.items.size() - 1);
    }

    /**
     * Returns the count of items in the box.
     * 
     * @return the count of items in the box
     */
    public int getCountOfitems() {
        return this.items.size();
    }

    /**
     * Returns the list of items in the box.
     * 
     * @return the list of items in the box
     */
    public List<T> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Box [items=" + items + "]";
    }

    
}
