package week03_ifAndLoop;

public class Ex11 {
    static void main(String[] args) {
        for(int row = 1; row <=3; row++){
            System.out.println("------");
            for (int column = 1; column <= 5; column++){
                int seat = (row -1) * 5 + column;
                System.out.println(seat + " ");
            }
        }
        System.out.println();
    }
}
