package Ch6;

public class Test09 {
    public static void main(String[] args) {
        int n[]={5,1,8,3,2};
        System.out.println(max(n, 0, n.length-1));
    }
    private static long max(int[] n, int low, int high) {
        if (high == 0) return n[high];
        int mid = (low + high) / 2;
        if (low < mid) {
            if (n[low] > max(n, low, mid)) return n[low];
            return max(n, low++, mid);
        }
        if (mid <= high) {
            if (n[high] > max(n, mid, high)) return n[high];
            return max(n, mid, high--);
        }
        if (max(n, low, mid) > max(n, mid, high)) return max(n, low, mid);
        return max(n, mid, high);
    }
}
