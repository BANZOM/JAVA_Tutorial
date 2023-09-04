import java.util.Locale;

public class LocaleClass {
    public static void main(String[] args) {
        Locale[] availableLocales = Locale.getAvailableLocales();

        System.out.println("Available Locale: ");
        for (Locale locale : availableLocales) {
            System.out.println(locale.getDisplayName());
        }

        // default locale:
        System.out.println("Default Locale: " + Locale.getDefault().getDisplayName());
    }
}
