public class while_loop {
    public static void main(String[] args) {
        
        int a = 1;

        while (a <= 10) {
            int b = 1;
            while (b <= a) {
                System.out.print("b");
                b++;
            } 
            System.out.println();
            a++;
        }

    }
}
