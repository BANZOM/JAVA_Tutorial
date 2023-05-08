import javax.print.event.PrintEvent;

public class logical_operator {
    public static void main(String[] args) {
        System.out.println(true & true);
        System.out.println(true &false);
        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(!true);
        System.out.println(!false);
    
        // Logical AND --> && ; Bitwise AND --> &, both will work the same with booleans
        System.out.println("With Relational operators: ");
        System.out.println(2>3 | 2>1);
        System.out.println(2>3 & 2>1);


    }
}
