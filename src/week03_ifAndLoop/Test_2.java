package week03_ifAndLoop;

import java.util.Scanner;

public class Test_2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int answer = (int) (Math.random() * 100) + 1;
        int attempts = 0;

        System.out.println("===== 숫자 맞히기 게임 =====");
        System.out.println("컴퓨터가 1부터 100 사이의 숫자를 정했습니다.");

        while (true) {
            System.out.print("숫자 입력(1~100): ");
            int guess = scanner.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("1~100만 입력하세요.");
                continue;
            }

            attempts++;

            if (guess < answer) {
                System.out.println("UP: 더 큰 수입니다.");
            } else if (guess > answer) {
                System.out.println("DOWN: 더 작은 수입니다.");
            } else {
                System.out.println("정답입니다.");
                System.out.println("시도 횟수: " + attempts + "회");
                break;
            }
        }

        System.out.println("게임을 종료합니다.");
        scanner.close();
    }
}
