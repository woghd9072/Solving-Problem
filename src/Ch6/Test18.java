package Ch6;

public class Test18 {
    public static void main(String[] args) {
        System.out.println(fibo(50));
    }

    private static long fibo(int i) {
        long a = i, b = 0;
        if (i <= 2) return i-1;
        while (i > 0) {
            b = fibo((int) (a-2)) + fibo((int) (a-1));
            i--;
        }
        return b;
    }
}
