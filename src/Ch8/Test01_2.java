package Ch8;

import java.util.Random;

public class Test01_2 {
    public static void main(String[] args) {
        int v[]=new int[1000000];
        Random random=new Random();
        for (int i = 0; i < v.length; i++) v[i]=random.nextInt(1000000);
        int key=1234;
        System.out.println(search(v, key));
    }
    private static int search(int[] v, int key) {
        int i = 0;
        int v1[];
        v1 = v;
        v1[v.length] = key;

        while (true) {
            if (v[i] == v1[v.length])
                break;
            else
                i++;
        }

        if (i == v.length) return -1;
        else return i;

    }
}
