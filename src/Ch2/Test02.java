package Ch2;

import java.util.LinkedList;

public class Test02 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i=1; i<=100; i++) linkedList.add(i);
        System.out.println(linkedList);
    }
}
