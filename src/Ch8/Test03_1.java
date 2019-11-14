package Ch8;

import java.util.Arrays;

public class Test03_1 {
    public static void main(String[] args) {
        int v[] = {2,3,6,8,9};
        Arrays.sort(v); // 배열 정렬
        int key = 8;
        int index = binarySearch(v, key); // 정렬된 배열 내 자료 위치 이진 탐색
        if(index < 0)
            System.out.println("배열 내 자료 없음");
        else
            System.out.println("자료 발견 위치(배열 내 index): "+index);
    }
    private static int binarySearch(int[] v, int key) {
        int left = 0, right = v.length-1;
        while(left <= right){
            int m = left + (right - left)/2;
            if(key == v[m])
                return m;
            if(key < v[m])
                right = m-1;
            else
                left = m+1;
        }
        return -1;
    }
}
