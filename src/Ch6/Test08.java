package Ch6;

public class Test08 {
    public static void main(String[] args) {
        int n[]={5,1,8,3,2};
        System.out.println(max(n, n.length-1));
    }
    private static int max(int[] n, int i) {
        if (i == 0) return n[i];
        if (n[i] > max(n, i-1)) return n[i];
        return max(n, i-1);
    }
}
