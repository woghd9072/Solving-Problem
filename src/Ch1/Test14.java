package Ch1;

import java.util.Random;

public class Test14 {
    public static void main(String[] args) {
        int n = 20;

        for (int i=0; i<n; i++) {
            Random random = new Random();
            int v = random.nextInt(7);
            if (v == 0) {
                n++;
                continue;
            }
            else System.out.print(v + " ");
        }
    }
}
