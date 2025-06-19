public class Algorithms_01_05 {

    public static boolean isAtEvenIndex(String s, char item) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        // all the work is in this for-loop, in the loop increment, and limit. We check half the letters but every second letter from the zero-eth
        
        for (int i = 0; i < s.length() / 2 + 1; i=i+2) {
            if (s.charAt(i) == item) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "HeLLo";
        System.out.println("L is at even index of "+s+": "+isAtEvenIndex(s, 'L'));
        System.out.println("T is at even index of "+s+": "+isAtEvenIndex(s, 'T'));
        System.out.println("H is at even index of "+s+": "+isAtEvenIndex(s, 'H'));
        System.out.println("H is at even index of \"\": "+isAtEvenIndex("", 'H'));
        System.out.println("H is at even index of null: "+isAtEvenIndex(null, 'H'));
    }
}