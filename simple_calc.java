public class simple_calc {
    public static void main(String[] args) {
        int n;
        System.out.println("CALCULATOR MENU");
        System.out.println("1. Additon\n2. Subtraction\n3. Multiplication\n4. Division");

        do {
            n = Integer.parseInt(System.console().readLine());
        } while (n != 5);
    }
}
