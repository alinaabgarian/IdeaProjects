import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateAndTimeTask2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputtedDate = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate date = LocalDate.parse(inputtedDate, formatter);



        if(date.getDayOfWeek().equals(DayOfWeek.FRIDAY)){
            if(date.getDayOfMonth() == 13){
                System.out.println("The date is Friday the 13th");
            }
            else{
                System.out.println("The day is not Friday the 13th");
            }
        }
        else {
            System.out.println("The day is not Friday the 13th");
        }


    }
}
