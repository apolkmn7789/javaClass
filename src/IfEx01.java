public class IfEx01 {
    public static void main(String[] args) {
        int age = 24;
        if(age >= 18){
            String message = "성인";
            System.out.println(message);
        }

        // System.out.printLn(message);
        // 컴파일 오류 : 범위 밖
    }
}
