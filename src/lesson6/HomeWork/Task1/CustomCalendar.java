package lesson6.HomeWork.Task1;

/**
 * Created by: Umar
 * DateTime: 9/17/2024 10:29 AM
 */
import java.text.DateFormatSymbols;
import java.util.Calendar;

    public class CustomCalendar {
        public static void main(String[] args) {
            // Calendar ob'ektini yaratamiz
            Calendar calendar = Calendar.getInstance();

            // Oyni va yilni o'qiymiz
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);

            // Haftaning kunlari nomlari
            String[] weekDays = new DateFormatSymbols().getShortWeekdays();

            // Oyni bosish uchun kalendarni birinchi kunga o'rnatamiz
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

            // Ekranga oy va yilni chiqaramiz
            System.out.println("      " + (month + 1) + " / " + year);

            // Haftaning qisqa kunlarini chop qilamiz
            for (int i = 1; i < weekDays.length; i++) {
                System.out.print(weekDays[i].substring(0, 3) + " ");
            }
            System.out.println();

            // Birinchi haftada bo'sh joylar (oy boshida)
            for (int i = 1; i < firstDayOfWeek; i++) {
                System.out.print("    ");
            }

            // Oyning kunlarini chiqarish
            for (int day = 1; day <= daysInMonth; day++) {
                System.out.printf("%3d ", day);
                if ((day + firstDayOfWeek - 1) % 7 == 0) {
                    System.out.println(); // Har 7 ta kunda yangi qatorga o'tamiz
                }
            }
        }
    }
