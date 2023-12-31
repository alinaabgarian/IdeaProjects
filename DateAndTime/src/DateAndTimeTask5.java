import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateAndTimeTask5 {
    public static void main(String[] args) {

        LocalDate date[] = new LocalDate[3];

        date[0] = LocalDate.of(2024, 1, 1);
        date[1] = LocalDate.of(2024, 12, 25);
        date[2] = LocalDate.of(2024, 10, 31);

        String name[] = new String[3];

        name[0] = "New Year";
        name[1] = "Christmas";
        name[2] = "Halloween";

        for(int a=0; a< date.length; a++){
            System.out.print(name[a]+" - ");
            System.out.println(date[a].getMonth() + " "+ date[a].getDayOfMonth());
            System.out.println("  ");
        }









    }
}
