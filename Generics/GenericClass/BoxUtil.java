package Generics.GenericClass;
// Writing Generic Method in non Generic class
public class BoxUtil {
    
    /**
     * Returns the number of items in the given `Box` object.
     * 
     * @param box The `Box` object.
     * @param <T> The type of items in the `Box`.
     * @return The number of items in the `Box`.
     */
    public static <T> int getItemCount(Box<T> box) {
        return box.getItems().size();
    }
}
