package Ch6;

import java.util.Arrays;

public class Test23_2 {
    public static void main(String[] args) {
        int v[] = new int[3];
        bitString(v, 0);
    }

    private static void bitString(int[] v, int i) {
        if (i == v.length) {
            System.out.println(Arrays.toString(v));
            return;
        }
        v[i] = 1;
        bitString(v, i+1);
        v[i] = 0;
        bitString(v, i+1);
    }
}
