package lesson6.HomeWork.Task3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;

/**
 * Created by: Umar
 * DateTime: 9/17/2024 10:45 PM
 */
public class BirthdayYear {
    public static void main(String[] args) {

        LocalDateTime birthday = LocalDateTime.of(2005,03,03, 0, 0, 0 );
        LocalDateTime nowTime = LocalDateTime.now();

        int a = birthday.get(ChronoField.SECOND_OF_MINUTE);
        int b = nowTime.get(ChronoField.SECOND_OF_MINUTE);

        int c = b - a;

        System.out.println(c);


    }
}
