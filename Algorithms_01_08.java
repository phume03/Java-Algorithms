public class Algorithms_01_08 {

    public static String reverseEachWord(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        String [] stringSplit = s.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for (String word : stringSplit) {
            String reversedWord = reverse(word);
            reversedString.append(reversedWord+" ");
        }
        
        return reversedString.toString().stripTrailing(); // supposedly the correct answer includes a trailing space even though the exercise solution does not
    }

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println("null reversed: "+reverseEachWord(null));
        System.out.println("\"\" reversed: "+reverseEachWord(""));
        System.out.println("\" \" reversed: "+reverseEachWord(" "));
        System.out.println("\"sally is a great worker\" reversed: "+reverseEachWord("sally is a great worker"));
        System.out.println("\"racer racecar madam\" reversed: "+reverseEachWord("racer racecar madam"));
        System.out.println("\"what can I do today\" reversed: "+reverseEachWord("what can I do today"));
    }
}