package AnonymousClass;

class A{
    void method1(){
        System.out.println("in default method1....");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new A();
        obj.method1();
    }
}
