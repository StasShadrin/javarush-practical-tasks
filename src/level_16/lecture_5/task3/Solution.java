package level_16.lecture_5.task3;

import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Path path = Path.of(str);
        if (path.isAbsolute())
            System.out.println(path);
        else
            System.out.println(path.toAbsolutePath());
    }
}
