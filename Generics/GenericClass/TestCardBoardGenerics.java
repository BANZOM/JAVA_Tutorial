package Generics.GenericClass;

public class TestCardBoardGenerics {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<>();
        CardBoardBox<Fruit> fruitCardBoardBox = new CardBoardBox<>();
        fruitCardBoardBox.addItem(new Fruit("Apple", "Red", 0.1));
        fruitCardBoardBox.addItem(new Fruit("Banana", "Yellow", 0.2));
        fruitBox = fruitCardBoardBox;

        System.out.println(fruitBox.getTotalWeight());

    }
}
