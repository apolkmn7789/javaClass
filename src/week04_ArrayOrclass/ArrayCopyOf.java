package week04_ArrayOrclass;

import java.util.Arrays;

public class ArrayCopyOf {
    static void main(String[] args) {
        int[] original = {10, 20, 30};
        int[] longer = Arrays.copyOf(original, 5);
        int[] shorter = Arrays.copyOf(original, 2);

        System.out.println(longer.length);
        System.out.println(shorter.length);
    }
}
