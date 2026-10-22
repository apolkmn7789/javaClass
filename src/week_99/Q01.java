package week_99;

import java.util.Scanner;

/*
 * 숫자2개를 입력받아서
 * 더하기 빼기 결과값을
 * 출력하는 프로그램을 만드세요.
 *
 * 1.숫자 2개를 입력 -> 입력 Scanner 정수 변수 2개
 * 2.더하기 연산 출력
 * 3.뻬기 연산 출력
 * */
public class Q01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 입력 값 : ");
        System.out.println();
        int num1 = sc.nextInt();
        System.out.print("두번째 입력 값 : ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int sub = num1 - num2;
        System.out.println("두수의 합 : "+sum);
        System.out.println("두수의 차 : " + sub);


    }
}
