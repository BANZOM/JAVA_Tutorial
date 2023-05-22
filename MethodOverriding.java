class ClassParent {
    void m1(){
        System.out.println("in m1 of A");
    }
}

class ClassChild extends ClassParent{
    void m1(){
        System.out.println("in m1 of B");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {    
        ClassChild c = new ClassChild();
        c.m1();
    }
}
