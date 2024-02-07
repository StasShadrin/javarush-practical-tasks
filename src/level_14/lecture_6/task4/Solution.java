package level_14.lecture_6.task4;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.DECEMBER));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        int index = month.ordinal();
        if (index == 11) {
            return Month.values()[0];
        } else {
            return Month.values()[index + 1];
        }
    }
}
