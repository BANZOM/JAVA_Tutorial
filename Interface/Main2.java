package Interface;

interface A {
    void m1();
    void m2();
}

class AA implements A {
    public void m1() {
        System.out.println("method 1 from AA class...");
    }

    public void m2() {
        System.out.println("methdo 2 from AA class...");
    }

}

class AB implements A {
    public void m1() {
        System.out.println("method 1 from AB class...");
    }
    
    public void m2() {
        System.out.println("methdo 2 from AB class...");
    }
}

public class Main2 {
    public static void main(String[] args) {
        A obj1,obj2;
        obj1 = new AA();
        obj2 = new AB();

        obj1.m1();
        obj2.m1();
        obj1.m2();
        obj2.m2();
    }
}
