package Ch1;

import java.util.Arrays;
import java.util.Random;

public class Test28 {
    public static void main(String[] args) {
        int N=5, M=10;
        int n[] = new int[N];
        Random random = new Random();

        for (int i=0; i<N; i++) n[i] = random.nextInt(M);
        System.out.println(Arrays.toString(n));

        for (int i=0; i<N-1; i++) {
            int temp = n[i+1];
            n[i+1] = n[i];
            n[i] = temp;
        }
        System.out.println(Arrays.toString(n));
    }
}
