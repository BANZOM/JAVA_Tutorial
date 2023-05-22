class A{
    A(){
        System.out.println("in default constructor of A");
    }
    A(String s){
        this();
        System.out.println("in parameterized constructor of A");
    }
}

class B extends A{
    B(){
        super("for parameter");
        System.out.println("in default constructor of B");
    }

    B(int x){
        this();
        System.out.println("in parameterized constructor of B");
    }
}

public class ThisAndSuper {
    // Understanding the this() an super() methods 
    public static void main(String[] args) {

        // this() method
        // this() method is used to call the constructor of the same class
        // this() method should be the first statement in the constructor
        // this() method can be used only in constructors
        // this() method can be used only once

        // super() method
        // super() method is used to call the constructor of the parent class
        // super() method should be the first statement in the constructor
        // super() method can be used only in constructors
        // super() method can be used only once

        // B obj1 = new B();
        // B obj2 = new B(10);
        // B obj3 = new B();
        // B obj4 = new B(10);
        B obj5 = new B(20);

        
    }
}
