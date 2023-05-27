package ExceptionExamples;

/*
 * Ducking of the exception sample example
 */


class main4A {
    void methodA1() throws Exception {
        System.out.println(10/0);
    }
}

class main4B {
    void methodB1() throws Exception {
        int[] arr = new int[3];
        System.out.println(arr[3]);
    }
}

class main4C{

    void methodC1() throws Exception {
        main4A a = new main4A();
        main4B b = new main4B();
        a.methodA1();
        b.methodB1();
    }
}

public class Main4 {
    public static void main(String[] args) {
        
        main4C c = new main4C();

        try {
            c.methodC1();
        } catch (Exception e) {
            System.out.println("Exception is handled by ducking " + e);
        }
        
        System.out.println("End of program");
    }  
}
