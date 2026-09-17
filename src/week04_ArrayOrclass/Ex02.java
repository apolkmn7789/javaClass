package week04_ArrayOrclass;

public class Ex02 {
    static void main(String[] args) {
        int[] original = {80,90,100};
        int[] alias = original;

        alias[1] = 50;

        System.out.println(original[1]);
        System.out.println(original == alias);
    }
}
