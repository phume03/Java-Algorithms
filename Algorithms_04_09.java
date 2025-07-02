import java.util.Stack;
import java.util.regex.Pattern;

public class Algorithms_04_09 {

    public static boolean isNumber(String token) {
        return Pattern.matches("([0-9])*", token);
    }

    public static boolean isOperator(String token) {
        return "+-/*".contains(token);
    }

    public static double evaluateExpression(String operator, double operand1, double operand2) {
        double result = 0;
        switch(operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                result = operand2 / operand1;
                break;
            default:
                break;
        }
        return result;
    }

    public static double evalReversePolishString(String tokenString) {
        String [] tokens = tokenString.split(" ");
        Stack <Double> operands = new Stack<>();
        double operand1, operand2, result;

        for (String token: tokens) {
            if (isNumber(token)) {
                operands.push(new Double(token));
            } else if (isOperator(token)) {
                operand1 = operands.pop();
                operand2 = operands.pop();
                result = evaluateExpression(token, operand1, operand2);
                operands.push(result);
            } else {
                // unhandled as we were guaranteed valid reverse polish
            }
        }

        if (!operands.empty())
            return operands.pop();
        else
            return 0.0; // somewhat unhandled due to guarantee
    }

    public static void main(String[] args) {
        System.out.println("3 4 + evaluates to: "+evalReversePolishString("3 4 +"));
        System.out.println("3 4 + 2 * 7 / evaluates to: "+evalReversePolishString("3 4 + 2 * 7 /"));
    }
}
