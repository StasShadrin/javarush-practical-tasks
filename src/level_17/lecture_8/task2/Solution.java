package level_17.lecture_8.task2;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Solution {
    static ZonedDateTime zonedDateTime = ZonedDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n VV");
        String text = dtf.format(zonedDateTime);
        System.out.println(text);
    }
}
