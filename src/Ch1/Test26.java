package Ch1;

import java.util.Arrays;
import java.util.Random;

public class Test26 {
    public static void main(String[] args) {
        int N=9, M=10;
        int n[] = new int[N];
        Random random = new Random();

        for(int i=0; i<N; i++) n[i]=random.nextInt(M);
        Arrays.sort(n);
        System.out.println(Arrays.toString(n));
        for(int i=0; i<N-1; i++) {
            if(n[i] == n[i+1]) {
                n[i] = -1;
            }
        }
        System.out.print("[ ");
        for(int i=0; i<N; i++) {
            if(n[i] != -1) System.out.print(n[i]+", ");
        }
        System.out.println("]");
    }
}
