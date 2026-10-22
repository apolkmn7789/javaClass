package week05_class;

public class Equipment {
    String name;
    int dailyFee;

    Equipment(String name, int dailyFee){
        this.name = name;
        this.dailyFee = dailyFee;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "name='" + name + '\'' +
                ", dailyFee=" + dailyFee +
                '}';
    }
}
