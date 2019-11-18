package Ch9;

import java.util.TreeMap;

public class Test04 {
    public static void main(String[] args) {
        TreeMap<Integer, Player> treeMap = new TreeMap<>();
        for (int i=1; i<=1000000; i++) treeMap.put(i, new Player(i));
        for (int i=1; i<=1000000; i++) {
            if ((treeMap.get(i).id)%2 == 1) treeMap.remove(i);
        }
        System.out.println(treeMap.values().toString());
    }
}
