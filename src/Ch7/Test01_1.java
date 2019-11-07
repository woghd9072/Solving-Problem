package Ch7;

import java.util.Arrays;

public class Test01_1 {
    public static void main(String[] args) {
        int v[] = {5,8,1,9,3,5,1,5};
        bubbleSort(v);
        System.out.println(Arrays.toString(v));
    }

    private static void bubbleSort(int[] v) {
        for (int i=0; i<v.length-1; i++) {
            for (int j=i+1; j<v.length; j++) {
                if (v[j-1] > v[j]) {
                    int temp = v[j];
                    v[j] = v[j-1];
                    v[j-1] = temp;
                }
            }
        }
    }
}
