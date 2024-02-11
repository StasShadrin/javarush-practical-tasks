package level_18.lecture_4.task5;

public class Cat extends Pet{
    public static final String CAT = "Я не люблю людей.";
    public void printInfo(){
        super.printInfo();
        System.out.println(CAT);
    }


}
