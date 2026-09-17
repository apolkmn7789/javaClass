package week04_ArrayOrclass;

import java.util.Arrays;

public class EnhancedForAssignment {
    static void main(String[] args) {
        int[] scores = {10,20,30,40,50};

        for (int score : scores) {
            score = 0;
        }
        System.out.println(
                Arrays.toString(scores)
        );
    }
}
