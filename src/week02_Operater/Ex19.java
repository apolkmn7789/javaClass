package week02_Operater;

public class Ex19 {
    static void main(String[] args) {
        int value = 3;
        int one = value << 1;
        int two = value << 2;
        System.out.println(one); // 6
        System.out.println(two); // 12
        System.out.println(value >> 1); // 1
        System.out.println(value >>> 1); // 1
    }
}
