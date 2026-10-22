package week_99;

import java.util.Scanner;

public class Q02 {
    static void main(String[] args) {
        /* 아이디와 비밀번호를 입력하여 인증 */
        String id = "user1234";
        String password = "1234";
        Scanner sc = new Scanner(System.in);
        String userId = sc.nextLine();
        String userPassword = sc.nextLine();
        if(id.equals(userId) && password.equals(userPassword)){
            System.out.println("로그인 완료!");
        } else if (id.equals(userId) || password.equals(userPassword)) {
            System.out.println("id 또는 password가 일치하지 않습니다.");
        } else{
            System.out.println("모두 일치하지 않습니다.");
        }
    }
}
