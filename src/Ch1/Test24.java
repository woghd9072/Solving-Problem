package Ch1;

import java.util.Random;

public class Test24 {
    public static void main(String[] args) {
        int N=9;
        int n[] = new int[N];
        Random random = new Random();

        for (int i=0; i<N; i++) n[i] = random.nextInt(10);

        int first = n[0], second = n[1];
        if (n[1] > n[0]) {
            first = n[1];
            second = n[0];
        } else if (first == second) second = n[2];

        for (int i=2; i<N; i++) {
            if (first < n[i]) {
                second = first;
                first = n[i];
            } else if (first > n[i] && second < n[i]) second = n[i];
        }

        if (first == second) System.out.println("None");
        System.out.println(second);
    }
}
