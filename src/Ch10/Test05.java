package Ch10;

import java.util.Arrays;

public class Test05 {
    public static void main(String[] args) {
        int heap[]= {3,1,2,8,7,9,4,6,5,4};
        int last=heap.length-1;
        for (int i = heap.length/2; i >=0; i--) heapifyDown(heap, last, i); // max-heap 빌드 O(n) -> min-heap
        System.out.println(Arrays.toString(heap));
        System.out.println("최대값="+peek(heap)); // 최대값 출력
        for (int i = 0; i < 5; i++) { // 상위 5개 자료 추출
             System.out.print(remove(heap, last--)+" "); // 각 추출 후 힙 크기 1 감소
        }
    }

    private static int remove(int[] heap, int last) {
        if(last<0) throw new RuntimeException("heap empty");
        int data=heap[0];
        heap[0]=heap[last--];
        for (int parent=0, child=2*parent+1; child<=last; parent=child, child=2*parent+1) {
            if(child<last && heap[child]<heap[child+1]) child++;
            if(heap[child]<=heap[parent]) break;
            int temp=heap[child]; heap[child]=heap[parent]; heap[parent]=temp;
        }
        return data;
    }

    private static int peek(int[] heap) {
        int[] arr = heap;
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    private static void heapifyDown(int[] heap, int last, int p) {
        for (int c = 2*p+1; c<=last; p=c, c=2*p+1) {
            if(c<last && heap[c]>heap[c+1]) c++; // 두 child 중 큰 값을 갖는 child 선택
            if(heap[p]<=heap[c]) break; // 이미 heap 조건 만족 시 반복 종료
            int temp=heap[c]; heap[c]=heap[p]; heap[p]=temp; // 힙 조건 위배 시 swap
        }
    }
}
