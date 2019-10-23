package Ch1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N=5, M=10;
        int n[] = new int[N];
        Random random = new Random();
        int k=scanner.nextInt();

        for (int i=0; i<N; i++) n[i] = random.nextInt(M);
        System.out.println(Arrays.toString(n));

        while(k>0) {
            int temp = n[N-1];
            for(int i=N-1; i>0; i--) {
                n[i] = n[i-1];
            }
            n[0] = temp;
            k--;
        }
        System.out.println(Arrays.toString(n));
    }
}
