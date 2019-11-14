package Ch8;

import java.util.Random;

public class Test01_1 {
    public static void main(String[] args) {
        int v[]=new int[1000000];
        Random random=new Random();
        for (int i = 0; i < v.length; i++) v[i]=random.nextInt(1000000);
        int key=1234;
        System.out.println(search(v, key));
    }
    private static int search(int[] v, int key) {
        int i;
        for (i=0; i<v.length; i++) {
            if (v[i] == key)
                return i;
            else return -1;
        }
        return i;
    }
}
