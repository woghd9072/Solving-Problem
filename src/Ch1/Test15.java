package Ch1;

import java.util.Random;

public class Test15 {
    public static void main(String[] args) {
        int n = 6000;
        int m[] = {0, 0, 0, 0, 0, 0};
        String s = "";

        for (int i=0; i<n; i++) {
            Random random = new Random();
            int v = random.nextInt(7);
            if (v == 0) {
                n++;
                continue;
            }
            else if (v == 1) m[0]++;
            else if (v == 2) m[1]++;
            else if (v == 3) m[2]++;
            else if (v == 4) m[3]++;
            else if (v == 5) m[4]++;
            else if (v == 6) m[5]++;
        }

        for (int i=0; i<m.length; i++) {
            if (i == m.length-1) s = s + m[i];
            else s = s + m[i] + ", ";
        }
        System.out.println("[" + s + "]");
    }
}
