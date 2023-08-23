class A_D {
    void show() {
        System.out.println("A");
    }
}
class B_D extends A_D {
    void show() {
        System.out.println("B");
    }
}
class C_D extends A_D {
    void show() {
        System.out.println("C");
    }
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        A_D a = new A_D();
        B_D b = new B_D();
        C_D c = new C_D();

        a.show();
        b.show();
        c.show();

    }
}
