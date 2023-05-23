package AnonymousClass;

class A{
    void method1(){
        System.out.println("in default method1....");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.method1();

        A obj2 = new A() // this is the anonymous class as it don't have name
        {
            void method1(){
                System.out.println("in modified method1....");
            }
        };
        obj2.method1();

        
    }
}
