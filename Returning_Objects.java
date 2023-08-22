class Box {
    int len;
    Box(int a) {
        this.len = a;
    }

    // returns a Box with len 10 times of given box length
    Box icmt () {
        return new Box(this.len * 10);
    }
}

public class Returning_Objects {
    public static void main(String[] args) {
        Box b1 = new Box(3);
        Box b2 = b1.icmt();

        System.out.println("Length of B1: " + b1.len);
        System.out.println("Length of B2: " + b2.len);

    }
}
