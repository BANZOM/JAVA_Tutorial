import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = new String(in.nextLine());

        System.out.println("The compressed string is:\n" + compress(s));

    }

    static String compress(String s) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            ans.append(s.charAt(i));
            int count = 1;
            while( i+1 < s.length() && s.charAt(i) == s.charAt(i+1)) {
                i++;
                count++;
            }
            if (count != 1)
                ans.append(count);
                
        }
        return ans.toString();
    }
}
