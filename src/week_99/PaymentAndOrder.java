package week_99;

import java.util.Scanner;

public class PaymentAndOrder {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coffeeCount = 0; // 커피
        int sandwichCount = 0; // 센드위치
        int waterCount = 0; // 생수
        int orderAmount = 0; // 주문 수량
        boolean paid = false; // 결제 여부
        String productName = ""; // 메뉴명
        int price = 0; // 가격
        orderLoop:

        // 메뉴판
        while (true) {
            System.out.println("\n===== 학과 행사 간식 주문 =====");
            System.out.println("1. 커피 2,500원");
            System.out.println("2. 샌드위치 4,500원");
            System.out.println("3. 생수 1,000원");
            System.out.println("4. 결제");
            System.out.println("0. 주문 취소");
            System.out.print("메뉴를 선택하세요: ");
            
            // 메뉴 선택 입력
            int menu = scanner.nextInt();
            // 메뉴 조건설정
            if (menu >= 1 && menu<= 3) {
                if(menu == 1){
                    productName = "커피";
                    price = 2500;
                }
                if(menu == 2){
                    productName = "센드위치";
                    price = 4500;
                }
                if(menu == 3){
                    productName = "생수";
                    price = 1000;
                }

                int quantity; // 상품 수량

                do {
                    System.out.print(productName + " 수량을 입력하세요: ");
                    quantity = scanner.nextInt();

                    if (quantity < 1) {
                        System.out.println("수량은 1개 이상이어야 합니다.");
                    }
                }
                while (quantity < 1);

                if (menu == 1) {
                    coffeeCount += quantity;
                } else if (menu == 2) {
                    sandwichCount += quantity;
                } else {
                    waterCount += quantity;
                }

                orderAmount += price * quantity;

                System.out.println(productName + " " + quantity + "개를 담았습니다.");
                System.out.println("현재 주문 금액: " + orderAmount + "원");

                continue;
            }

            if (menu == 4) {
                if (orderAmount == 0) {
                    System.out.println("먼저 상품을 선택하세요.");
                    continue;
                }

                int discountRate;

                if (orderAmount >= 20000) {
                    discountRate = 10;
                } else if (orderAmount >= 10000) {
                    discountRate = 5;
                } else {
                    discountRate = 0;
                }

                int discountAmount = orderAmount * discountRate / 100;
                int paymentAmount = orderAmount - discountAmount;

                for (int i = 0; i < 30; i++) {
                    System.out.print("=");
                }

                System.out.println();
                System.out.println("커피: " + coffeeCount + "개");
                System.out.println("샌드위치: " + sandwichCount + "개");
                System.out.println("생수: " + waterCount + "개");
                System.out.println("주문 금액: " + orderAmount + "원");
                System.out.println("할인율: " + discountRate + "%");
                System.out.println("할인 금액: " + discountAmount + "원");
                System.out.println("결제 금액: " + paymentAmount + "원");

                paid = true;
                break orderLoop;
            }

            if (menu == 0) {
                break orderLoop;
            }

            System.out.println("0부터 4까지의 메뉴 번호를 입력하세요.");
        }

        if (paid) {
            System.out.println("결제가 완료되었습니다.");
        } else {
            System.out.println("주문을 취소했습니다.");
        }

        scanner.close();
    }
}