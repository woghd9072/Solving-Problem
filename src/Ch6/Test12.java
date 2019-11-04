package Ch6;

public class Test12 {
    public static void main(String[] args) {
        String s="ABCDEDCBA";
        System.out.println(palindrome(s, 0));
    }
    private static boolean palindrome(String s, int i) {
        if (i == s.length()/2) return true;
        if (s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        return palindrome(s, i+1);
    }
}
