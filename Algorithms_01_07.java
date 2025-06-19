public class Algorithms_01_07 {

    public static String reverse(String s) {
        if(s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }

        return reversed.toString();
    }

    public static String reverse2(String s) {
        if(s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println("null reversed: "+reverse(null));
        System.out.println("\"\" reversed: "+reverse(""));
        System.out.println("hello reversed: "+reverse("hello"));
        System.out.println("tacos reversed: "+reverse("tacos"));
        System.out.println("Hi! reversed: "+reverse("Hi!"));
        System.out.println();
        System.out.println("null reversed: "+reverse2(null));
        System.out.println("\"\" reversed: "+reverse2(""));
        System.out.println("hello reversed: "+reverse2("hello"));
        System.out.println("tacos reversed: "+reverse2("tacos"));
        System.out.println("Hi! reversed: "+reverse2("Hi!"));
        System.out.println("\nNB: The results should be exactly the same.");
        
    }
}