class demo {
    double pi =  3.14159;
    public void m1() {
        System.out.println("Inside m1");
    }

    public double m2(int r) {
        double area = pi * r * r;
        return area;
    }

}

public class methods {
    public static void main(String[] args) {
        demo d = new demo();
        d.m1();
        System.out.println(d.m2(5));
    }
}
