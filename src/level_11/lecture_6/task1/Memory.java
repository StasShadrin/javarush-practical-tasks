package level_11.lecture_6.task1;

import java.util.Arrays;

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        String[] temp = new String[array.length];
        int j = 0;
        for (String s : array) {
            if (s != null) {
                temp[j] = s;
                j++;
            }
        }
        System.arraycopy(temp, 0, array, 0, array.length);
    }
}