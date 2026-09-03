package week02_Operater;

public class Ex12 {
    static void main(String[] args) {
        long priceWon = 3500;
        long count = 4;
        long discountRate = 10;

        long subtotalWon = priceWon * count;
        long discountWon
                = subtotalWon * discountRate / 100;
        long paymentWon
                = subtotalWon - discountWon;

        System.out.println(paymentWon);
    }
}
