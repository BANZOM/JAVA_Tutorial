package Generics.GenericClass;

public class TestBoxGenerics {
    public static void main(String[] args) {
        // Invoke the box generic type
        Box<Book> bookBox = new Box<>();

        Box<Fruit> fruitBox = new Box<>();

        bookBox.addItem(new Book("Rudest Book Ever", "Shwetabh Gangwar", 2021, 0.2));
        bookBox.addItem(new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 2017, 0.3));
        bookBox.addItem(new Book("How to win Friends and Influence People", "Dale Carnegie", 2018, 0.4));

        fruitBox.addItem(new Fruit("Apple", "Red", 0.1));
        fruitBox.addItem(new Fruit("Banana", "Yellow", 0.2));

        System.out.println(bookBox.getLatestItem());
        System.out.println(bookBox);
        System.out.println(fruitBox.getLatestItem());
        System.out.println(fruitBox);

        System.out.println(bookBox.getItemCount());
        System.out.println(fruitBox.getItemCount());

        System.out.println("Book Box Size: " + BoxUtil.getItemCount(bookBox));
        System.out.println("Fruit Box Size: " + BoxUtil.getItemCount(fruitBox));

        // Box<Integer> integerBox = new Box<>();  //--> Error because Integer is not under the bound of Box i.e BoundMismatch
    }
}
