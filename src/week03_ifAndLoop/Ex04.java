package week03_ifAndLoop;

public class Ex04 {
    static void main(String[] args) {
        int score = 90;
        String grade;

        if(score >= 90){
            grade = "A";
        } else if (score >= 80 && score < 90) {
            grade = "B";
        } else if (score < 80 && score >= 70) {
            grade = "C";
        }else {
            grade = "D";
        }
    }
}
