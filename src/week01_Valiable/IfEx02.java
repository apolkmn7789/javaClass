package week01_Valiable;

public class IfEx02 {
    public static void main(String[] args) {
        int score = 75;
        String result;

        if(score >= 60){
            result = "합격";
        } else {
            result = "불합격";
        }
        System.out.println(result);
    }
}
