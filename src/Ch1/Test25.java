package Ch1;

import java.util.Arrays;
import java.util.Random;

public class Test25 {
    public static void main(String[] args) {
        int N=8, M=10, m=N/2;
        int n[] = new int[N];
        Random random = new Random();

        for (int i=0; i<N; i++) n[i] = random.nextInt(M);
        Arrays.sort(n);

        double v = 0;
        if (N%2 == 0) {
            v = (double)(n[m]+n[m-1])/2;
            System.out.println(v);
        } else if (N%2 != 0) {
            System.out.println(n[m]);
        }
        System.out.println(Arrays.toString(n));
    }
}
