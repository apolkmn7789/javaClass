package week02_Operater;

public class Ex06 {
    static void main(String[] args) {
        byte x = 10;
        byte y = 20;
        int result = x + y;
//        byte wrong = x + y;
        byte narrowed = (byte) (x + y);
        System.out.println(result);
        System.out.println(narrowed);
    }
}
