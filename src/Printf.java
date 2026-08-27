import java.util.Scanner;

public class Printf {
    public static void main(String[] args) {
        String name = "김자바";
        int months = 6;
        double rating = 4.567;
        boolean available = true;
        System.out.printf("이름: %s%n", name);
        System.out.printf("개월: %d%n", months);
        System.out.printf("평점: %.2f%n", rating);
        System.out.printf("가능: %b%n", available);
    }
}
