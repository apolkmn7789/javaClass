package week01_Valiable;

public class StringEx02 {
    public static void main(String[] args) {
        String role = "Java Backend";

        int length = role.length();
        char first = role.charAt(0);
        boolean hasJava = role.contains("Java");
        boolean backend = role.endsWith("Backend");

        System.out.println(length);
    }
}
