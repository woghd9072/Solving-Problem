package Ch6;

import java.util.Arrays;

public class Test21 {
    public static void main(String[] args) {
        String s[] = {"서울", "대구", "부산"};
        perm(s, 0);
    }

    private static void perm(String[] s, int i) {
        if (i == s.length) {
            System.out.println(Arrays.toString(s));
            return;
        }
        for (int j=i; j<s.length; j++) {
            String temp=s[i]; s[i]=s[j]; s[j]=temp;
            perm(s, i+1);
            temp=s[i]; s[i]=s[j]; s[j]=temp;
        }
    }
}
