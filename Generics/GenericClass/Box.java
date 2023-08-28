package Generics.GenericClass;
import java.util.*;

/**
 * Represents a box containing items of type T.
 * 
 * @param <T> the type of items stored in the box
 */
public class Box<T extends Boxable> {
    private List<T> items;

    /**
     * Constructs an empty box.
     */
    public Box() {
        this.items = new ArrayList<>();
    }

    /**
     * Adds an item to the box.
     * 
     * @param item the item to be added
     */
    public void addItem(T item) {
        items.add(item);
    }

    /**
     * Returns the latest item added to the box.
     * 
     * @return the latest item added to the box
     * @throws NoSuchElementException if the box is empty
     */
    public T getLatestItem() {
        if (items.isEmpty()) {
            throw new NoSuchElementException("Box is empty");
        }
        return items.get(items.size() - 1);
    }

    /**
     * Returns the count of items in the box.
     * 
     * @return the count of items in the box
     */
    public int getItemCount() {
        return items.size();
    }

    public double getTotalWeight() {
        return this.items.stream().mapToDouble(Boxable::getWeight).sum();
    }

    @Override
    public String toString() {
        return "Box [items=" + items + "]";
    }

    public List<T> getItems() {
        return items;
    }
}
