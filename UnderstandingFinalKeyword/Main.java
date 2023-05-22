package UnderstandingFinalKeyword;

public class Main {
    public static void main(String[] args) {
        final int x = 5;
        // x = 6; // error: cannot assign a value to final variable x
        System.out.println(x);
    }
}
