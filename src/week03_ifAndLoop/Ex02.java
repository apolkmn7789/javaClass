package week03_ifAndLoop;

public class Ex02 {
    static void main(String[] args) {
        int amount = 29999;
        int deliveryFee = amount;

        if (amount >= 30000){
            System.out.println(amount);
        }else{
            System.out.println(amount+3000);
        }
        System.out.println(deliveryFee);
    }
}
