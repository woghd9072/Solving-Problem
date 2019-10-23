package Ch1;

import java.util.Arrays;
import java.util.Random;

public class Test27 {
    public static void main(String[] args) {
        int N=9, M=10;
        int n[] = new int[N];
        int rank[] = new int[N];
        Random random = new Random();

        for (int i=0; i<N; i++) n[i] = random.nextInt(M);
        Arrays.sort(n);

        for (int i=0; i<N/2; i++) {
            int temp = n[i];
            n[i] = n[n.length-1-i];
            n[n.length-1-i] = temp;
        }

        rank[0] = 1;
        for (int i=1; i<N; i++) {
            if (n[i] == n[i-1]) rank[i] = rank[i-1];
            else if (n[i] < n[i-1]) rank[i] = rank[i-1] + 1;
        }

        System.out.println(Arrays.toString(n));
        System.out.println(Arrays.toString(rank));
    }
}
