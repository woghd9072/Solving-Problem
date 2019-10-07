package Ch4;

import java.util.Arrays;
import java.util.Stack;

public class Test10 {
    public static void main(String[] args) {
        String e = "3 1 2 / *";
        System.out.println(postfixEval(e));
    }

    private static double postfixEval(String e) {
        Stack<Double> stack = new Stack<>();
        double n1, n2;
        for (String token : e.split("\\s+")) {
            if ("+".equals(token)) {
                n2 = stack.pop();
                n1 = stack.pop();
                stack.push(n1 + n2);
            } else if ("-".equals(token)) {
                n2 = stack.pop();
                n1 = stack.pop();
                stack.push(n1 - n2);
            } else if ("*".equals(token)) {
                n2 = stack.pop();
                n1 = stack.pop();
                stack.push(n1 * n2);
            } else if ("/".equals(token)) {
                n2 = stack.pop();
                n1 = stack.pop();
                stack.push(n1 / n2);
            } else
                stack.push(Double.valueOf(token));
        }
        return stack.pop();
    }
}
