package week02_Operater;

public class Ex22 {
    static void main(String[] args) {
        int price = 3000;
        int delivery = 500;
        int count = 2;

        int first = price + delivery * count;
        int second = (price + delivery) * count;
        System.out.println(first); // 4000
        System.out.println(second); // 7000
    }
}
