package Ch4;

public class Test13 {
    public static void main(String[] args) {
        String s="대한민국의 수도는 서울이다.";
        char stack[] = new char[s.length()];
        int top = -1;

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            stack[i] = c;
        }

        for (top=s.length()-1; top>=0; top--) {
            System.out.print(stack[top]);
        }
    }
}
