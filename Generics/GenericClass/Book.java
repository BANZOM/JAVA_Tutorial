package Generics.GenericClass;

public class Book {
    private String name;
    private String author;
    private int yearOfPublish;
    private int weight;

    public Book(String name, String author, int yearOfPublish, int weight) {
        this.name = name;
        this.author = author;
        this.yearOfPublish = yearOfPublish;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", author=" + author + ", yearOfPublish=" + yearOfPublish + ", weight=" + weight
                + "]";
    }

}
