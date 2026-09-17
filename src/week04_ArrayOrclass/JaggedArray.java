package week04_ArrayOrclass;

public class JaggedArray {
    static void main(String[] args) {
        int[][] dailySales = {
                {12000, 18000, 9000},
                {21000, 15000},
                {8000, 11000, 17000, 13000}
        };
        System.out.println(dailySales[1].length);
        System.out.println(dailySales[1][1]);
    }
}
