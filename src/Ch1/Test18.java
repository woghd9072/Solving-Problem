package Ch1;

import java.util.Arrays;

public class Test18 {
    public static void main(String[] args) {
        int n[]={5,7,9,1,3,5,8,2,4,9};
        Arrays.sort(n);

        for (int i=n.length-1; i>=0; i--) {
            for (int j=i-1; j>=0; j--) {
                int temp = n[i];
                n[i] = n[j];
                n[j] = temp;
            }

        }
        System.out.println(Arrays.toString(n));
    }
}
