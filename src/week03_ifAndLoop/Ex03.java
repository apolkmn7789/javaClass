package week03_ifAndLoop;

public class Ex03 {
    static void main(String[] args) {
        int amount = 60000;
        boolean member = true;
        int rate;

        if(member && amount >= 60000){
            rate = 10;
        } else if (member && amount >= 20000) {
            rate = 5;
        }else {
            rate = 0;
        }
    }
}
