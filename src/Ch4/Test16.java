package Ch4;

import java.util.Arrays;

public class Test16 {
    public static void main(String[] args) {
        int n[]={1,2,3,4};
        System.out.println(Arrays.toString(n));
        int m[]=arrayCopy(n, n.length*2); // 2배 확장
        n=m;
        System.out.println(Arrays.toString(n));
        n=arrayCopy(n, (int) (n.length*0.25)); // 1/4로 축소
        System.out.println(Arrays.toString(n));
    }

    private static int[] arrayCopy(int[] n, int newSize) {
        int m[] = new int[newSize];
        if (newSize > n.length) {
            for (int i=0; i<m.length; i++) {
                if (i > n.length-1) {
                    m[i] = 0;
                } else m[i] = n[i];
            }
        } else if (newSize < n.length) {
            for (int i=0; i<m.length; i++) {
                m[i] = n[i];
            }
        }
        return m;
    }
    }
