package Ch1;

public class Test10 {
    public static void main(String[] args) {
        String s1="999999999999999999999999999999999999999999999";
        String s2="888888888888888888888888888888888888";

        System.out.println(add(s1,s2));
    }

    public static String add(String s1, String s2) {
        String result = "", zero = "";

        for (int i=0; i<Math.abs(s1.length()-s2.length()); i++) zero = zero+"0";

        if (s1.length() < s2.length()) s1 = zero + s1;
        else s2 = zero + s2;

        int c = 0;
        for (int i=s1.length()-1; i>=0; i--) {
            int v = s1.charAt(i) - '0' + s2.charAt(i) - '0' + c;
            c = v/10;
            result = v%10 + result;
        }
        if (c > 0) result = c + result;

        return result;
    }
}
