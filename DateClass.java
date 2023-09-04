import java.util.Date;

public class DateClass {
    public static void main(String[] args) {
        Date d = new Date();
        String dateAsString = d.toString();

        System.out.println("Date as String: " + dateAsString);

        Long timeInMillis = d.getTime();

        System.out.println("Time in Milliseconds: " + timeInMillis);
    }
}
