package Ch7;

import java.util.Arrays;

public class Test04 {
    public static void main(String[] args) {
        int n[] = {1,3,5,7,8};
        int m[] = {2,4,6,7,10};
        int v[] = mergeArray(n, m);
        System.out.println(Arrays.toString(v));
    }

    private static int[] mergeArray(int[] n, int[] m) {
        int v[] = new int[n.length + m.length];
        for (int i=1; i<n.length; i++) {
            for (int j=0; j<n.length; j++) {
                if (n[i-1] < m[j]) {
                    v[j+i-1] = n[i-1];
                    v[j+i] = m[j];
                }

            }
        }
        return v;
    }
}
