package Ch1;

public class Test06 {
    public static void main(String[] args) {
        int n = 987654321;
        int k = 4;
        int m = 1;

        for (int i=1; i<k; i++) {
            m = m * 10;
        }

        System.out.println((n/m)%10);
    }
}
