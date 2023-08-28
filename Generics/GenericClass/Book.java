package Generics.GenericClass;

public class Book {
    private String name;
    private String author;
    private int yearOfPublish;
    private double weight;

    /**
     * Constructs a new Book object with the given name, author, year of publication, and weight.
     *
     * @param name          the name of the book
     * @param author        the author of the book
     * @param yearOfPublish the year of publication of the book
     * @param weight        the weight of the book
     */
    public Book(String name, String author, int yearOfPublish, double weight) {
        this.name = name;
        this.author = author;
        this.yearOfPublish = yearOfPublish;
        this.weight = weight;
    }

    /**
     * Returns the name of the book.
     *
     * @return the name of the book
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the author of the book.
     *
     * @return the author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Returns the year of publication of the book.
     *
     * @return the year of publication of the book
     */
    public int getYearOfPublish() {
        return yearOfPublish;
    }

    /**
     * Returns the weight of the book.
     *
     * @return the weight of the book
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Returns a string representation of the Book object.
     *
     * @return a string representation of the Book object
     */
    @Override
    public String toString() {
        return "Book [name=" + name + ", author=" + author + ", yearOfPublish=" + yearOfPublish + ", weight=" + weight
                + "]";
    }
}
