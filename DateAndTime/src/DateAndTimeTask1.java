import java.time.LocalDate;
import java.time.Month;

public class DateAndTimeTask1 {
    public static void main(String[] args) {
        boolean leap = LocalDate.now().isLeapYear();
        Month.JANUARY.length(leap);

        Month days[] = Month.values();

        for(int a=0; a<12; a++){
            System.out.println(days[a]+" - "+days[a].length(leap));
        }

    }
}
