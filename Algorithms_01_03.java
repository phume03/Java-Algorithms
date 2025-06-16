public class Algorithms_01_03 {

    public static String normalizeString(String s) {
        return s.toLowerCase().trim().replace(",", "");
    }

    public static void main(String[] args) {
        System.out.println("   Hello There, BUDDY "+" -> "+normalizeString("   Hello There, BUDDY "));

    }
}