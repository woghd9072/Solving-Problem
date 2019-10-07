package Ch4;

import java.util.Stack;

public class Test06 {
    public static void main(String[] args) {
        String s="부산({Busan}[(Boo)(saan)])시청({City}{hall}[(See)(Cheong)])"; // true
        System.out.println(checkParen(s));
    }
    private static boolean checkParen(String s) {
        Stack<Character> stack=new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[')
                stack.push(c);
            else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') return false;
                else stack.pop();
            }
            else if (c == '}') {
                if (stack.isEmpty() || stack.peek() != '{') return false;
                else stack.pop();
            }
            else if (c == ']') {
                if (stack.isEmpty() || stack.peek() != '[') return false;
                else stack.pop();
            }
        }
        if (!stack.isEmpty()) return false;
        else return true;
    }
}
