package Generics.GenericClass;

/**
 * The `Fruit` class represents a fruit object with its name, color, and weight.
 */
public class Fruit {
    private String name;
    private String color;
    private double weight;

    /**
     * Constructor that initializes the `name`, `color`, and `weight` fields of the fruit object.
     * @param name The name of the fruit.
     * @param color The color of the fruit.
     * @param weight The weight of the fruit.
     */
    public Fruit(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    /**
     * Method that returns the name of the fruit.
     * @return The name of the fruit.
     */
    public String getName() {
        return name;
    }

    /**
     * Method that returns the color of the fruit.
     * @return The color of the fruit.
     */
    public String getColor() {
        return color;
    }

    /**
     * Method that returns the weight of the fruit.
     * @return The weight of the fruit.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Method that overrides the `toString()` method to provide a string representation of the fruit object.
     * @return A string representation of the fruit object.
     */
    @Override
    public String toString() {
        return "Fruit [name=" + name + ", color=" + color + ", weight=" + weight + "]";
    }
}
