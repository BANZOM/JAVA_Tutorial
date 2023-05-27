package ExceptionExamples;

/*
 * Ducking of the exception sample example
 */


class main4A {
    void methodA1() {
        System.out.println(10/0);
    }
}

class main4B {
    void methodB1() {
        int[] arr = new int[3];
        System.out.println(arr[3]);
    }
}
public class Main4 {
    public static void main(String[] args) {
        main4A a = new main4A();
        a.methodA1();

        main4B b = new main4B();
        b.methodB1();
        
    }
}
