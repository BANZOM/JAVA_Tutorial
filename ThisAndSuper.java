class A{
    A(){
        System.out.println("in default constructor of A");
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

        A obj1 = new A();

        
    }
}
