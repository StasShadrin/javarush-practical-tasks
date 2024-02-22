package level_17.lecture_2.task1;

import java.util.Calendar;
import java.util.Date;


public class Solution {

    static Date birthDate = new Date(88, Calendar.MARCH, 6);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        String result = "";
        int day = date.getDay();
        return switch (day) {
            case 0 -> "воскресенье";
            case 1 -> "понедельник";
            case 2 -> "вторник";
            case 3 -> "среда";
            case 4 -> "четверг";
            case 5 -> "пятница";
            case 6 -> "суббота";
            default -> result;
        };
    }
}


