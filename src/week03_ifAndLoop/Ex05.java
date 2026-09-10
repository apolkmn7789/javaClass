package week03_ifAndLoop;

public class Ex05 {
    static void main(String[] args) {
        int number
                = (int) (Math.random() * 6) + 1;

        System.out.println(number);

        if(number == 1){
            System.out.println("1번");
        } else if (number == 2) {
            System.out.println("2번");
        } else {
            System.out.println("3번부터 6번");
        }
    }
}
