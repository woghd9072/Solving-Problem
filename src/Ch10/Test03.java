package Ch10;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Test03 {
    public static void main(String[] args) {
        int v[]={4, 2, 9, 5, 7, 5, 8, 10, 15};
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < v.length; i++) list.add(v[i]);
        PriorityQueue<Integer> pq=new PriorityQueue<>(list); // 최소힙 생성
        System.out.println("최소값="+pq.peek()); // 삭제하지 않고 큐의 root값 반환
        for (int i = 0; i<v.length; i++) {
            System.out.println(pq.remove()+"=>"+pq);
        }
    }
}
