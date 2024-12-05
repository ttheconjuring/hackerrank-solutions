package prepare.java;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class JavaDateAndTime {

    public static void main(String[] args) {

        System.out.println(findDay(8, 5, 2015));

    }

    public static String findDay(int month, int day, int year) {
        DayOfWeek dayOfWeek = LocalDate.of(year, month, day).getDayOfWeek();
        return dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH).toUpperCase();
    }

}
