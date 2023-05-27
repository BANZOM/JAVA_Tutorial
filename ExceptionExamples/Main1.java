package ExceptionExamples;

public class Main1 {
    public static void main(String[] args) {
        
        for (int i = -10; i <= 10; i++) {
            try {
                System.out.println(10/i);
            } 
            catch (ArithmeticException e) {
                System.out.println("Division by zero,"+e);
            }
            catch (Exception e) {
                System.out.println("Something went wrong when i = "+ i);
            }
        }

        System.out.println("End of program");
    }
}
