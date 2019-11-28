package Ch8;

import java.util.Arrays;

public class Test03_2 {
    public static void main(String[] args) {
        int v[] = {2,3,6,8,9};
        Arrays.sort(v); // 배열 정렬
        int key = 9;
        int index=binarySearch(v, key, 0, v.length-1); // 정렬된 배열 내 자료 위치 이진 탐색
        if(index < 0) System.out.println("배열 내 자료 없음");
        else System.out.println("자료 발견 위치(배열 내 index): "+index);
    }

//    private static int binarySearch(int[] v, int key, int left, int right) {
//        // recursive
//        int mid = (left + right)/2;
//        if (left > right) return -1;
//        if (v[mid] == key) return mid;
//        return key < v[mid] ? binarySearch(v, key, left, mid-1) : binarySearch(v, key, mid+1, right);
//    }

    private static int binarySearch(int[] v, int key, int left, int right) {
        // recursive
        int mid = (left + right)/2;
        if (v[mid] == key) return mid;
        if (left > right) return -1;
        if (v[mid] > key) return binarySearch(v, key, left, mid-1);
        else return binarySearch(v, key, mid+1, right);
    }
}
