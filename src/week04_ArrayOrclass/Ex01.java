package week04_ArrayOrclass;

public class Ex01 {
    static void main(String[] args) {
        int[] scores = {70,80};
        int[] copied = scores;
        copied[0] = 100;

        System.out.println(scores[0]);
    }
}
