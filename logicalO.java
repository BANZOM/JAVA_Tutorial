import javax.print.event.PrintEvent;

public class logicalO {
    public static void main(String[] args) {
        System.out.println(true & true);
        System.out.println(true &false);
        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(!true);
        System.out.println(!false);
    
        // you can use either && or &, both will work the same
        System.out.println("With Relational operators: ");
        System.out.println(2>3 | 2>1);
        System.out.println(2>3 & 2>1);

    }
}
