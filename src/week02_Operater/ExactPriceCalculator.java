package week02_Operater;

import java.util.Scanner;

public class ExactPriceCalculator {
    static void main(String[] args) {
        /*
        원, 개, 퍼센트를 long으로 입력받는다
        Scanner로 세 정수를 입력받는다. 이번 실습은 사용자가 숫
        자를 정확히 입력한다는 계약으로 진행하고, 형식 오류 처리
        는 뒤 주차에서 추가한다.
        입력
        단가는 0원 이상의 정수다.
        수량은 0개 이상의 정수다.
        할인율은 0-100의 정수다.
        모든 금액 변수 이름에 Won을 붙인다.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("단가(원): ");
        long priceWon = scanner.nextLong();
        System.out.print("수량(개): ");
        long count = scanner.nextLong();
        System.out.print("할인율(%): ");
        long discountRate = scanner.nextLong();

        long subtotalWon = priceWon * count;
        long discountWon = subtotalWon * discountRate/100;
        long paymentWon = subtotalWon - discountWon;

        System.out.printf("소계: %,d원%n", subtotalWon);
        System.out.printf("할인: %,d원%n", discountWon);
        System.out.printf("결제: %,d원%n", paymentWon);

    }
}
