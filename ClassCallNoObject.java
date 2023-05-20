class NoMethodClass {
    static{
        System.out.println("in NoMethodClass Static Block 1...");
    }
    {
        System.out.println("in NoMethodClass Static Default Block 2...");
    }
    public NoMethodClass(){
        System.out.println("in NoMethodClass Constructor Block 3...");
    }
}
public class ClassCallNoObject {
    public static void main(String[] args) throws ClassNotFoundException {
        
        // call class without object:
        Class.forName("NoMethodClass");
    }
}
