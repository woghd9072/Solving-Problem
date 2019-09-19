package Ch2;

import java.util.Arrays;

public class Test10 {
    public static void main(String[] args) {
        int n[] = {3,4,5,6,7,0,0,0,0,0};
        for (int i=0; i<n.length; i++) {
            if (i+1 == n.length) break;
            n[i] = n[i+1];
        }
        System.out.println(Arrays.toString(n));
    }
}
