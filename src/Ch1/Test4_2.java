package Ch1;

import java.util.Arrays;

public class Test4_2 {
    public static void main(String[] args) {
        long v[]={34,76,11,3,7,13,9};
        Arrays.sort(v);

        long min = v[1] - v[0];
        for (int i=0; i<v.length; i++) {
            for (int j=i+1; j<v.length; j++) {
                if (min > v[j] - v[i]) {
                    min = v[j] - v[i];
                } else continue;
            }
        }

        System.out.println(min);
    }
}
