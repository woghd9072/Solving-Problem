package Ch1;

import java.util.Random;

public class Test20 {
    public static void main(String[] args) {
        int N=20, sum=0;
        int n[] = new int[N];
        Random random = new Random();

        for (int i=0; i<N; i++) {
            n[i] = random.nextInt(100);
            sum = sum + n[i];
        }
        float avg = sum/N;
        System.out.printf("%.2f", avg);
    }
}
