package level_12.lecture_3.task1;

import static java.lang.Double.parseDouble;

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        double aDouble = parseDouble(string);
        System.out.println(Math.round(aDouble));
    }
}
