class Factorial {
    int fact(int i) {
        if (i <= 1)
            return 1;
        return i * fact(i - 1);
    }
}

public class Recursion_Example {
    public static void main(String[] args) {
        Factorial F = new Factorial();

        System.out.println("Factorial of 1: " + F.fact(1));
        System.out.println("Factorial of 2: " + F.fact(2));
        System.out.println("Factorial of 3: " + F.fact(3));
        System.out.println("Factorial of 4: " + F.fact(4));
        System.out.println("Factorial of 5: " + F.fact(5));
        System.out.println("Factorial of 6: " + F.fact(6));

    }
}
