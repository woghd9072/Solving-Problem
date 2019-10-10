package Ch4;

import java.util.Stack;

public class Test11 {
    public static void main(String[] args) {
        String e="34 12 25/*";
        System.out.println(postfixEval(e));
    }
    private static double postfixEval(String e) {
        Stack<Double> stack=new Stack<>();
        String v[] = e.split("\\s+");
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
