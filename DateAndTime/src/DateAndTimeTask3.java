import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateAndTimeTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputtedDate = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(inputtedDate, formatter);

        LocalDate birthday = LocalDate.of(2009, 4, 22);

        int birthYear = birthday.getYear();

        int birthMonth = birthday.getMonthValue();

        int birthDay = birthday.getDayOfMonth();

        LocalDate result = date.minusDays(birthDay).minusMonths(birthMonth).minusYears(birthYear);

        int age = result.getYear();


        if(age<0){
            System.out.println("You have not been born yet");
        }
        else{
            System.out.println(age);
        }





    }
}
