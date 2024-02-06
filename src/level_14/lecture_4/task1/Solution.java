package level_14.lecture_4.task1;

import java.util.HashMap;

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Честер Беннингтон", 4.5);
        grades.put("Майк Шинода", 4.4);
        grades.put("Джо Хан", 3.5);
        grades.put("Брэд Дэлсон", 4.6);
        grades.put("Роб Бурдон", 2.5);
    }
}
