package week05_class;

public class ex {
    static void main(String[] args) {
        String name = "노트북";
        int dailyFee = 1000;
        Equipment equipment = new Equipment(name ,dailyFee);
        System.out.println(equipment);
    }
}
