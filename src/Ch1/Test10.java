package Ch1;

import java.math.BigInteger;

public class Test10 {
    public static void main(String[] args) {
        String s1="999999999999999999999999999999999999999999999";
        String s2="888888888888888888888888888888888888";

        BigInteger n1=new BigInteger(s1);
        BigInteger n2=new BigInteger(s2);

        System.out.println(n1.add(n2));
    }
}
