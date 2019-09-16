package Ch1;

import java.util.Random;

public class Test29 {
    public static void main(String[] args) {
        int N=5, M=10;
        int n[] = new int[N];
        Random random = new Random();

        for (int i=0; i<N; i++) n[i] = random.nextInt(M);
    }
}
