package level_19.lecture_1.task5;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}
