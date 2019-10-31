package Ch6;

public class Test18 {
    public static void main(String[] args) {
        System.out.println(fibo(50));
    }

    private static long fibo(int i) {
        long a = i;
        if (i <= 2) return i-1;
        while (i > 0) {
            fibo(i-2) + fibo(i-1);
        }
        return a;
    }
}
