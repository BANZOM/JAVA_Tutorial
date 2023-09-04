import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatClass {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String formattedDate = dateFormat.format(new Date());

        System.out.println("Formatted String: " + formattedDate);
    }
}
