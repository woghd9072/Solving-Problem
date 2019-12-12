package Ch13;

public class Test06_5 {
    public static void main(String[] args) {
        int n[] = {2,3,5,1,2,2,5};
        int count[] = new int[101];

        for (int i=0; i<n.length; i++) count[n[i]]++;
        int maxCount = 0, maxValue = n[0];
        for (int i=0; i<count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxValue = i;
            }
        }
    }
}
