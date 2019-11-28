package Ch7;

import java.util.Arrays;

public class Test05 {
    public static void main(String[] args) {
        int v[]={1,3,5,7,8,2,4,6,7,10};
        mergeArray(v, 0, 4, 5, 9); // v의 부분 배열들 v[0..4], v[5..9]이 정렬된 상태임
        System.out.println(Arrays.toString(v));
    }
    private static void mergeArray(int[] v, int left1, int right1, int left2, int right2) {
        int[] w = new int[right2 - left1 + 1];
        int i = left1, j = left2, k = 0;

        while(i <= right1 && j <= right2) w[k++] = (v[i] < v[j]) ? v[i++] : v[j++];

        while(i <= right1) w[k++] = v[i++];
        while(j <= right2) w[k++] = v[j++];

        for(i = left1, k = 0; k < w.length;) v[i++] = w[k++];
    }
}