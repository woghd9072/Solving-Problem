package Ch6;

public class Test14_b {
    public static void main(String[] args) {
        System.out.println(gcd(64,48));
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        while (b > 0) {
            int c = b;
            b = a % b;
            a = c;
        }
        return a;
    }
}
