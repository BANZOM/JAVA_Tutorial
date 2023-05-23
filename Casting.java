class A{
    void m1() {
        System.out.println("m1");
    }
}
class B extends A{
    void m2() {
        System.out.println("m2");
    }
}

public class Casting {
    public static void main(String[] args) {
        A obj1 = new B(); // upcasting
        obj1.m1(); 

        B obj2 = (B)obj1; // downcasting
        obj2.m2();
    }
}
