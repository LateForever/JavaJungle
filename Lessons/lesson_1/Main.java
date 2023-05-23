package Lessons.lesson_1;

public class Main {
    public static void main(String args[]) {

        Singleton inst1 = Singleton.getInstance();
        Singleton inst2 = Singleton.getInstance();

        System.out.println(inst1 == inst2);

    }
}
