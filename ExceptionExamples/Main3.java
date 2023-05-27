package ExceptionExamples;

/*
 * Generating Custom Exceptions
 */

class AdityaBuildAnException extends Exception {
    public AdityaBuildAnException(String customMessage) {
        super(customMessage);
    }
}

public class Main3 {
    public static void main(String[] args) {
        for (int i = -10; i <= 10; i++) {
            int n;
            try {
                n = 10/i;
                if (n == 1) {
                    throw new AdityaBuildAnException("custom exception throwed");
                }
            } catch (AdityaBuildAnException e) {
                n = 10/(i+1);
                System.out.println(e);
            }
            catch (Exception e) {
                n = i;
                System.out.println("Something went wrong when i = "+ i);
            }
            System.out.println(n);
        }
    }
}
