import java.util.Calendar;
public class CalenderClass {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println(String.format("%d/%d/%d", day, month+1, year));
    }
}
