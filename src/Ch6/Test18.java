package Ch6;

public class Test18 {
    public static void main(String[] args) {
        System.out.println(fibo(50));
    }

    private static long fibo(int i) {
        long n[] = new long[i+1];

        n[0] = 0; n[1] = 1;
        for (int j=2; j<i; j++) {
            n[j] = n[j-2] + n[j-1];
        }
        return n[i];
    }
}
