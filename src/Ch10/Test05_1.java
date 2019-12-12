package Ch10;

import java.util.Arrays;

public class Test05_1 {
    public static void main(String[] args) {
        int heap[]= {3,1,2,8,7,9,4,6,5,4};
        int last=heap.length-1;
        for (int i = heap.length/2; i >=0; i--) heapifyDown(heap, last, i); // max-heap 빌드 O(n) -> min-heap
        System.out.println(Arrays.toString(heap));
    }

    private static void heapifyDown(int[] heap, int last, int p) {
        for (int c = 2*p+1; c<=last; p=c, c=2*p+1) {
            if(c<last && heap[c]>heap[c+1]) c++; // 두 child 중 큰 값을 갖는 child 선택
            if(heap[p]<=heap[c]) break; // 이미 heap 조건 만족 시 반복 종료
            int temp=heap[c]; heap[c]=heap[p]; heap[p]=temp; // 힙 조건 위배 시 swap
        }
    }
}
