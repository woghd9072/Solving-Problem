package Ch6;

import java.util.Arrays;

public class Test23_3 {
    public static void main(String[] args) {
        char v[] = new char[3];
        bitString(v, 0);
    }

    private static void bitString(char[] v, int i) {
        if (i == v.length) {
            System.out.println(Arrays.toString(v));
            return;
        }
        v[i] = 'A';
        bitString(v, i+1);
        v[i] = 'B';
        bitString(v, i+1);
    }
}
