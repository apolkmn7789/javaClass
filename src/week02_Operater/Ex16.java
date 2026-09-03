package week02_Operater;

public class Ex16 {
    static void main(String[] args) {
        int age = 27;

        boolean atLeast19 = age >= 19;
        boolean atMost34 = age <= 34;
        boolean inRange
                = atLeast19 && atMost34;

        System.out.println(inRange);
    }
}
