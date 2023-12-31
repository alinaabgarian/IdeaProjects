import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
        Date date1 = new Date();

        System.out.println(formatter.format(date1));


    }
}
