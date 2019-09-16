package Ch1;

import java.util.Random;

public class Test26 {
    public static void main(String[] args) {
        int N=9, M=10;
        int n[] = new int[N];
        Random random = new Random();

        for (int i=0; i<N; i++) n[i] = random.nextInt(M);

        int v = n[0];
        for (int i=1; i<N; i++) {
            if (n[i-1] == n[i]) System.out.print(n[i] + " ");
            else if (n[i-1] != n[i]) System.out.println();
        }
    }
}
