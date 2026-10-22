package week09_throwExample;

import java.util.Scanner;

public class CatchExample {
    static void main(String[] args) {



    try{
        int quantity = Integer.parseInt("10");
        System.out.println(quantity);
    }catch (NumberFormatException e){
        System.out.println("숫자로 입력하세요.");
    } finally {
        System.out.println("검사 종료");
    }
        System.out.println("다음 작업");
    }
}

