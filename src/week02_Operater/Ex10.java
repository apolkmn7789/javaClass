package week02_Operater;

public class Ex10 {
    static void main(String[] args) {
        int price = 1_500_000_000;
        int count = 2;
        long wrong = price * count;
        long correct = (long) price * count;
        System.out.println(wrong);
        System.out.println(correct);
    }
}
