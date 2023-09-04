import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatClass {
    public static void main(String[] args) {
        // Creating a NumberFormat instance for a specific locale (e.g., US)
        Locale usLocale = new Locale("en", "US");
        
        NumberFormat numberFormat = NumberFormat.getInstance(usLocale);

        // Formatting a numeric value as a string
        double num = 1234.2345; 

        String formattedNum = numberFormat.format(num);

        System.out.println("Formatted Number: " + formattedNum);
    }
}
