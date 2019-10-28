package Ch6;

public class Test10 {
    public static void main(String[] args) {
        String s="South, Korea 안녕";
        char v[]=s.toCharArray();
        toUpper(v, 0);
        System.out.println(v);
    }
    private static void toUpper(char[] v, int i) {
        if ('a' <= v[i] && v[i] <= 'z') {
            v[i] = (char) (v[i] + 32);
        }
        if (i < v.length-1) toUpper(v, i+1);
    }
}
