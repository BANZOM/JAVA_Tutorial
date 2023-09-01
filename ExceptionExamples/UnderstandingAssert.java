package ExceptionExamples;
/*
 * Assertion
 */
public class UnderstandingAssert {
    public static void main(String[] args) {
        int a = 15;
        assert a >= 18: "Assertion failed";
        System.out.println("Assertion passed");
    }
}
