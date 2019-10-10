package Ch1;

public class Test4_1 {
    public static void main(String[] args) {
        long v[]={34,76,11,3,7,13,9};
        long min = Math.abs(v[0] - v[1]);

        for (int i=0; i<v.length; i++) {
            for (int j=i+1; j<v.length; j++) {
                if (min > Math.abs(v[i] - v[j])) {
                    min = Math.abs(v[i] - v[j]);
                } else continue;
            }
        }

        System.out.println(min);
    }
}
