import java.util.*;

class Aug22_qus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter: ");
        int input = in.nextInt();

        Aug22_qus_logic a = new Aug22_qus_logic(input);

        System.out.println("Output: " + a.output());
    }
}

class Aug22_qus_logic {
    int input;

    Aug22_qus_logic(int i) {
        if (i > 1 || i < 0) {
            throw new RuntimeException("Enter 0 or 1 only");
        }
        this.input = i;
        System.out.println("Done");
    }

    int output() {
        try {
            return 0 / this.input;
        } catch (Exception e) {
            return 1;
        }
    }
}