package week03_ifAndLoop;

import java.util.Scanner;

public class Ex13 {
    static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
     int total = 0;
    int value = scanner.nextInt();
        while (value != -1) {
        total += value;
        value = scanner.nextInt();
        }
    }
}
