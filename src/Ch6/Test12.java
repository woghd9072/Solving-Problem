package Ch6;

public class Test12 {
    public static void main(String[] args) {
        String s="ABCDEECBA";
        System.out.println(palindrome(s, 0));
    }
    private static boolean palindrome(String s, int i) {
        char c[] = s.toCharArray();
        int j = s.length()-1;
        int mid = s.length()-1 / 2;

        if (c[i] == c[j] || i == mid || j == mid) {
            palindrome(s, i+1);
            palindrome(s, j-1);
            return true;
        } else if (i == mid || j == mid) return false;
        else return false;
    }
}
