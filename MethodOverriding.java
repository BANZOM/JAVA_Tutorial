class ClassParent {
    void m1(){
        System.out.println("in m1 of A");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        ClassParent p = new ClassParent();
        p.m1();
    }
}
