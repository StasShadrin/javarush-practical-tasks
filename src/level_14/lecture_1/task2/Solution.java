package level_14.lecture_1.task2;

import java.util.HashSet;

import static java.util.Arrays.asList;

public class Solution {
    public static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));

    public static void checkWords(String word) {
        if (words.contains(word)) {
            System.out.printf("Слово %s есть в множестве\n", word);
        } else {
            System.out.printf("Слова %s нет в множестве\n", word);
        }
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}
