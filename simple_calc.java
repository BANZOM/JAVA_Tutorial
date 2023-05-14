class calculations{
    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
    public int mul(int a, int b) {
        return a * b;
    }
    public double div(int a, int b) {
        return a / b;
    }
}

public class simple_calc {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 22;
        int result;

        calculations calc = new calculations();

        result = calc.add(n1, n2);
        System.out.print("Addition:");
        System.out.println(result);

    }
}
