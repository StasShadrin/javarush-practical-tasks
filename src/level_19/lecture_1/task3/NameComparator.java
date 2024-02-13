package level_19.lecture_1.task3;

import java.util.Comparator;

public class NameComparator implements Comparator<JavaRushMentor> {
    @Override
    public int compare(JavaRushMentor mentor1, JavaRushMentor mentor2) {
        return mentor1.getName().length() - mentor2.getName().length();
    }
}
