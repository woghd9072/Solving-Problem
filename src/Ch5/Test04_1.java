package Ch5;

import java.util.LinkedList;

public class Test04_1 {
    public static void main(String[] args) {
        System.out.println(solveJosephusProblem(7,3));
    }
    private static int solveJosephusProblem(int n, int k) {
        LinkedList<Integer> queue = new LinkedList<>();
        int c = 0;
        for (int i=1; i<=n; i++) queue.add(i);
        while (queue.size() > 1) {
            for (int i=0; i<k-1; i++) {
                queue.addLast(queue.removeFirst());
            }
            queue.remove(c);
            System.out.println(queue);
        }
        return queue.get(0);
    }
}
