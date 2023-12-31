import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateAndTimeTask4 {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));

        LocalDate birthday = LocalDate.of(2009, 4, 22);



        LocalDate date = LocalDate.now();

        if(birthday.isAfter(date)){
            System.out.println("Not born yet");
        }
        else{
            long difference = birthday.toEpochDay() - date.toEpochDay();
            long result = -1*difference;
            System.out.println(result+" days");

        }



    }
}
