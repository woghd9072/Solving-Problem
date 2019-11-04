package Ch6;

public class Test22 {
    public static void main(String[] args) {
        System.out.println(fact(20));
        System.out.println(time(fact(20)));
    }

    private static long time(long fact) {
        long s, m, h, d, y;
        s = fact/100000000;
        for (int i=0; i<s; i++) {

        }
        return s;
    }

    private static long fact(int i) {
        if (i == 0) return 1;
        return i * fact(i-1);
    }
}
