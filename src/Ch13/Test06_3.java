package Ch13;

import java.util.HashMap;

public class Test06_3 {
    public static void main(String[] args) {
        int n[] = {2,3,5,1,2,2,5};

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
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
