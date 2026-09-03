package week02_Operater;

public class Ex05 {
    static void main(String[] args) {
        int number = -7;
        System.out.println(number / 3);
        System.out.println(number % 3);
        boolean even = number % 2 == 0;
        boolean odd = number % 2 != 0;
        System.out.println(even);
        System.out.println(odd);
    }
}
