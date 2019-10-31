package Ch6;

public class Test12 {
    public static void main(String[] args) {
        String s="ABCDEECBA";
        System.out.println(palindrome(s, 0));
    }
    private static boolean palindrome(String s, int i) {
        char c[] = s.toCharArray();
        int mid = c.length/2;

        if (i < mid) {
            if (c[i] == c[(c.length-1)-i]) {
                palindrome(s, i+1);
                return true;
            } else {
                palindrome(s, i+1);
                return false;
            }
        }
        else
            return false;
    }
}
