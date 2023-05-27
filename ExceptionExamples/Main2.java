package ExceptionExamples;

public class Main2 {
    public static void main(String[] args) {
        for (int i = -10; i <= 10; i++) {
            try {
                if (10/i == 1) {
                    throw new ArithmeticException("exception throwed");
                    
                }
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
