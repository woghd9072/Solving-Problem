package Ch6;

public class Test11 {
    public static void main(String[] args) {
        String s="South, Korea";
        char v[]=s.toCharArray();
        System.out.println(countUpper(v, 0));
    }
    private static int countUpper(char[] v, int i) {
        int c = 0;
        if ('A' <= v[i] && v[i] <= 'Z') c++;

        if (i == v.length-1) return c;
        return c + countUpper(v, i+1);
    }
}
