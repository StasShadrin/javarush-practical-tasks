package level_16.lecture_6.task1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            Path path = Path.of(str);
            if (str.isEmpty()) {
                break;
            } else if (Files.isRegularFile(path)) {
                System.out.println(str + THIS_IS_FILE);
            } else if (Files.isDirectory(path)) {
                System.out.println(str + THIS_IS_DIR);
            } else {
                break;
            }
        }
    }
}
