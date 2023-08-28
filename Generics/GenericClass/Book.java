package Generics.GenericClass;

public class Book {
    private String name;
    private String author;
    private int yearOfPublish;
    private double weight;

    public Book(String name, String author, int yearOfPublish, double weight) {
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

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", author=" + author + ", yearOfPublish=" + yearOfPublish + ", weight=" + weight
                + "]";
    }

}
