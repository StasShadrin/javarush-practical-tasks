package level_18.lecture_4.task5;

public class Dog extends Pet{
    public static final String DOG = "Я люблю людей.";

    public void printInfo(){
        super.printInfo();
        System.out.println(DOG);
    }
}
