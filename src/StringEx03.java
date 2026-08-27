public class StringEx03 {
    public static void main(String[] args) {
        String raw = " Java Backend ";

        String cleaned = raw.trim();
        String firstWorld = cleaned.substring(0,4);
        String changed = cleaned.replace("Backend", "Developer");

        System.out.println(raw);
        System.out.println(changed);
    }
}
