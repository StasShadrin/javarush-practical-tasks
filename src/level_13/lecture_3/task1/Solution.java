package level_13.lecture_3.task1;

import java.util.ArrayList;

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
        paySalary("Гвинно");
        System.out.println(waitingEmployees);
        System.out.println(alreadyGotSalaryEmployees);
    }

    public static void paySalary(String name) {
        if(waitingEmployees.contains(name)) {
            alreadyGotSalaryEmployees.add(name);
            int index = waitingEmployees.indexOf(name);
            waitingEmployees.set(index, null);
        }
    }
}
