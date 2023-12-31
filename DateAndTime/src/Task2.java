import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date");
        String strDate = scanner.nextLine();

        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);
        SimpleDateFormat formatting = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.of("ru"));


        try {
            Date date = formatter.parse(strDate);
            System.out.println(formatting.format(date));
        }
        catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
