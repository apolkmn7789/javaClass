package week02_Operater;

public class Ex18 {
    static void main(String[] args) {
        int first = 7; // 0111
        int second = 8; // 1000

        int firstLastBit = first & 1;
        int secondLastBit = second & 1;

        System.out.println(firstLastBit);
        System.out.println(secondLastBit);
    }
}
