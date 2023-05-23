package InnerClass;

class Outer{

    void show() {
        System.out.println("in Outer..");
    }

    class Inner{
        void display() {
            System.out.println("in Inner..");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer objO = new Outer();
        objO.show();

        Outer.Inner objI = objO.new Inner();
        objI.display();
    }
}
