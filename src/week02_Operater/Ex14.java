package week02_Operater;

public class Ex14 {
    static void main(String[] args) {
        double result = 10.0 / 0.0;

        boolean infinite
                = Double.isInfinite(result);
        boolean nan
                = Double.isNaN(result);
        boolean invalid = infinite || nan;

        System.out.println(infinite);
        System.out.println(nan);
        System.out.println(invalid);
    }
}
