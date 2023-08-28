package Generics.GenericClass;

public class TestBoxGenerics {
    public static void main(String[] args) {
        
        Box<Book> bookBox = new Box<>(); // Invoke the box geneic type

        Box<Fruit> fruitBox = new Box<>(); 

        System.out.println(fruitBox);
        System.out.println(bookBox);
    }
}
