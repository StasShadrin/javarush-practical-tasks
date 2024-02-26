package level_17.lecture_8.task1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Solution {
    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyyг. Hч.mмин");
        String text = dateTimeFormatter.format(localDateTime);
        System.out.println(text);
    }
}

