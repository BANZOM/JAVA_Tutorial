package AbstractAnnonymousClass;

abstract class A{
    abstract void method1();
}


public class Main {
    public static void main(String[] args) {
        A obj = new A() {
            void method1(){
                System.out.println("in anonymous method1....");
            }
        };

        obj.method1();
        
    }
}
