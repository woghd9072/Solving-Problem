package Ch10;

import java.util.*;

public class Test04 {
    public static void main(String[] args) {
        Random random=new Random();
        int N=1000000;
        ArrayList<Integer> list=new ArrayList<>();
        int v[]=new int[N];
        for (int i = 0; i < N; i++) {
            int value=random.nextInt(N);
            list.add(value);
            v[i]=value;
        }
        long start;
        // PriorityQueue add
        start=System.currentTimeMillis();
        PriorityQueue<Integer> pq1=new PriorityQueue<>();
        for (int i = 0; i < v.length; i++) pq1.add(v[i]);
        for (int i = 0; i < 10; i++) System.out.print(pq1.remove()+" ");
        System.out.println(" ... "+(System.currentTimeMillis()-start)+" ms (PriorityQueue-add)");
        // PriorityQueue build
        start=System.currentTimeMillis();
        PriorityQueue<Integer> pq2=new PriorityQueue<>(list);
        for (int i = 0; i < 10; i++) System.out.print(pq2.remove()+" ");
        System.out.println(" ... "+(System.currentTimeMillis()-start)+" ms (PriorityQueue-build)");
        // TreeSet add
        start=System.currentTimeMillis();
        TreeSet<Integer> bst=new TreeSet<>();
        for (int i = 0; i < v.length; i++) bst.add(v[i]);
        for (int i = 0; i < 10; i++){
            Integer n=bst.first();
            System.out.print(n+" ");
            bst.remove(n);
        }
        System.out.println(" ... "+(System.currentTimeMillis()-start)+" ms (TreeMap)");
        // Sort
        start=System.currentTimeMillis();
        Arrays.sort(v);
        for (int i = 0; i < 10; i++) System.out.print(v[i]+" ");
        System.out.println(" ... "+(System.currentTimeMillis()-start)+" ms (Arrays.sort())");
    }
}
