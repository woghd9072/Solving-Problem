package Ch2;

import java.util.LinkedList;
import java.util.Random;

public class Test05 {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Integer> list = new LinkedList<>();

        for (int i=0; i<1000000; i++) list.add(random.nextInt(101));
        int v = list.get(99999);
        System.out.println(v);
    }
}
