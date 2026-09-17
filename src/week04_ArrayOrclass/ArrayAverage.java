package week04_ArrayOrclass;

public class ArrayAverage {
    static void main(String[] args) {
        int total = 0;
        int[] scores = new int[5];
        for (int index = 0;
             index < scores.length;
             index++) {
            total += scores[index];
        }
        double average = (double) total / scores.length;
    }
}
