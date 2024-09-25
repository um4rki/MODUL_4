package lesson6.HomeWork.Task2;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Created by: Umar
 * DateTime: 9/17/2024 10:36 PM
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate localDate = LocalDate.of(2021,12,15);
        LocalDate today = LocalDate.now();

        if(today.isLeapYear() && localDate.isLeapYear()){
            System.out.println("Leap Year ->" + today);
            System.out.println("Leap Year ->" + localDate);
        } else if (localDate.isLeapYear()) {
            System.out.println("Leap Year ->" + localDate);
        } else if (today.isLeapYear()) {
            System.out.println("Leap Year ->" + today);
        } else {
            System.out.println("Not a leap year");
        }
    }
}
