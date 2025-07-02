public class Algorithms_04_08 {

    public static boolean hasMatchingParentheses(String s) {
        int matchingSymbolTracker = 0;

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '(') {
                matchingSymbolTracker++;
            } else if (current == ')') {
                if (matchingSymbolTracker > 0) {
                    matchingSymbolTracker--;
                } else {
                    return false;
                }
            }
        }

        return matchingSymbolTracker == 0;
    }

    public static void main(String[] args) {
        System.out.println("((algorithm())) has matching parentheses: "+hasMatchingParentheses("((algorithm()))"));
        System.out.println("()(algorithm()) has matching parentheses: "+hasMatchingParentheses("()(algorithm())"));
        System.out.println("((algorithm)) has matching parentheses: "+hasMatchingParentheses("((algorithm))"));
        System.out.println("(algorithm) has matching parentheses: "+hasMatchingParentheses("(algorithm)"));

        System.out.println();

        System.out.println("(algorithm( has matching parentheses: "+hasMatchingParentheses("(algorithm("));
        System.out.println(")algorithm) has matching parentheses: "+hasMatchingParentheses(")algorithm)"));
        System.out.println(")algorithm( has matching parentheses: "+hasMatchingParentheses(")algorithm("));
        System.out.println("algorithm(( has matching parentheses: "+hasMatchingParentheses("algorithm(("));
        System.out.println("(algorithm has matching parentheses: "+hasMatchingParentheses("(algorithm"));
        System.out.println("((algorithm) has matching parentheses: "+hasMatchingParentheses("((algorithm)"));
    }
}
