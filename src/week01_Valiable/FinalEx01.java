package week01_Valiable;

public class FinalEx01 {
    public static void main(StringEX01[] args) {
        final int PASS_SCORE = 60;
        int score = 75;

        boolean passed = score >= PASS_SCORE;

        System.out.println(passed);

        // PASS_SCORE = 70;
        // 컴파일 오류 : 다시 대입할 수 없음
    }
}
