package week01_Valiable;

public class Overflow {
    public static void main(StringEX01[] args) {
        // 계산 시점부터 long 이어야 한다.
        int price = 1_500_000_000;
        int count = 2;

        long wrong = price * count;
        long correct = (long) price * count;

        System.out.println(wrong);
        System.out.println(correct);
    }
}
