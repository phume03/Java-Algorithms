public class Algorithms_01_06 {
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

    public static void main(String[] args) {
        System.out.println("null reversed: "+reverse(null));
        System.out.println("\"\" reversed: "+reverse(""));
        System.out.println("hello reversed: "+reverse("hello"));
        System.out.println("tacos reversed: "+reverse("tacos"));
        System.out.println("Hi! reversed: "+reverse("Hi!"));
    }
}
