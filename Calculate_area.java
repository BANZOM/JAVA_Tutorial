class Rectangle {
    private int length, breadth;

    Rectangle(int x, int y) {
        length = x;
        breadth = y;
    }

    public int calculate() {
        int area = length * breadth;
        return area;
    }
}

public class Calculate_area {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 6);
        int area = r.calculate();
        System.out.println("Area of rectangle is: " + area);
    }
}


// Implemented Encapsulation, Abstraction, method, object