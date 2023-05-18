package Project1;

public class Area {
    private int length;
    private int breadth;

    // constructor
    Area (int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    // default constructor
    Area() {

    }

    public void calculate() {
        System.out.println("Area is " + length * breadth);
    }
}

