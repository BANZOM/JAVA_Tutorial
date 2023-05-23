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

    static class SInner{
        void display() {
            System.out.println("in Static inner..");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer objO = new Outer();
        objO.show();

        Outer.Inner objI = objO.new Inner();
        objI.display();

        Outer.SInner objS = new Outer.SInner();
        objS.display();
    }
}
