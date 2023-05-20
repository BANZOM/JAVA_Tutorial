class StaticBlockClass1 {

    int a;
    static String ss;

    static{
        ss = "Static String Value";
        System.out.println("in Class1 Static Block 1...");
    }

    StaticBlockClass1(){
        a = 99;
        System.out.println("in Class1 Constructor Block 2...");
    }

    public void show(){
        System.out.println("in Class1 Static show Block 3...");
    }

    {
        System.out.println("in Class1 Static Default Block 4...");
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        StaticBlockClass1 s = new StaticBlockClass1();
        StaticBlockClass1 p = new StaticBlockClass1();

        s.show();
        p.show();
    }
}
