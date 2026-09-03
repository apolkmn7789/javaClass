package week02_Operater;

public class Ex13 {
    static void main(String[] args) {
        double normal = 10.0 / 2.0;
        double infinity = 10.0 / 0.0;
        double nan = 0.0 / 0.0;
        System.out.println(normal); // 5.0
        System.out.println(infinity); // Infinity
        System.out.println(nan); // NaN
    }
}
