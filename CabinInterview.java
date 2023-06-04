import java.util.Scanner;

public class CabinInterview {
    public static void main(String[] args) {

        sum(0);
    }

    private static void sum (int sum) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // sc.next();

        if (input.equalsIgnoreCase("stop")) {
            System.out.println(sum);
        }
        else {
            sum += Integer.parseInt(input);
            sum(sum);
        }

    }
}
