package Ch13;

import java.util.Arrays;

public class Test06 {
    public static void main(String[] args) {
        int n[] = {2,3,5,1,2,2,5};

        Arrays.sort(n);
        int maxCount = 0, maxValue = n[0], count = 1;
        for (int i=1; i<n.length; i++) {
            if (n[i-1] != n[i]) {
                if (count > maxCount) {
                    maxCount = count;
                    maxValue = n[i-1];
                }
                count = 0;
            }
            count++;
        }
        if (count > maxCount) {
            maxCount = count;
            maxValue = n[n.length-1];
        }
    }
}
