package level_14.lecture_2.task1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public static void print(HashSet<String> words) {
        Iterator<String> it = words.iterator();
        while(it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Программированию обычно учат на примерах.".split(" ")));
        print(words);
    }
}
