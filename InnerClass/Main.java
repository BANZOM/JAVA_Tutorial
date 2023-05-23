package InnerClass;

class Outer{

    void show() {
        System.out.println("in Outer..");
    }
}

public class Main {
    public static void main(String[] args) {
        Outer objO = new Outer();
        objO.show();
    }
}
