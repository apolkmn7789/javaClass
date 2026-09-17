package week04_ArrayOrclass;

import java.util.Scanner;

public class ArrayInput {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];
        for (int index = 0; index < scores.length; index++) {
            System.out.print((index + 1) +
                    "번 점수: ");
            scores[index] =
                    scanner.nextInt();
        }
    }
}
