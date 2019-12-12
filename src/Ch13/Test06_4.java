package Ch13;

import java.util.HashMap;
import java.util.TreeMap;

public class Test06_4 {
    public static void main(String[] args) {
        int n[] = {2,3,5,1,2,2,5};

        TreeMap<Integer, Integer> hashMap = new TreeMap<Integer, Integer>();
        for (int i=0; i<n.length; i++) {
            if (hashMap.containsKey(n[i])) hashMap.put(n[i], hashMap.get(n[i])+1);
            else hashMap.put(n[i], 1);
        }

        int maxValue = n[0], maxCount = 0;
        for (int key : hashMap.keySet()) {
            int count = hashMap.get(key);
            if (count > maxCount) {
                maxCount = count;
                maxValue = key;
            }
        }
    }
}
