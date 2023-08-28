package Generics.GenericClass;

// public class TestWildCard extends Box<?> 
public class TestWildCard {
    public static void main(String[] args) {
        // new Box<?>();

        // var box = BoxUtil.<?>getEmptyBox();

        // unbound Wildcard usuage
        Box<Fruit> fruitBox = new Box<>();
        fruitBox.addItem(new Fruit("Apple", "Red", 0.1));
        fruitBox.addItem(new Fruit("Banana", "Yellow", 0.2));

        System.out.println("Item Count: " + BoxUtil.getItemCount(fruitBox));
        System.out.println("Average Weight: " + fruitBox.getAverageWeightOfFruits());
    }
}
