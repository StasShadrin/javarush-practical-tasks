package level_13.lecture_2.task3;

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int count = 0;
        char[] charArray = string.toCharArray();
        for (char c : charArray) {
            if (Character.isDigit(c)){
                count++;
            }
        }
        return  count;
    }

    public static int countLetters(String string) {
        int count = 0;
        char[] charArray = string.toCharArray();
        for (char c : charArray) {
            if (Character.isLetter(c)){
                count++;
            }
        }
        return  count;
    }

    public static int countSpaces(String string) {
        int count = 0;
        char[] charArray = string.toCharArray();
        for (char c : charArray) {
            if (Character.isSpaceChar(c)){
                count++;
            }
        }
        return  count;
    }
}
