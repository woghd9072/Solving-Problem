package Ch11;

import java.util.Arrays;
import java.util.LinkedList;

public class Test06_2 {
    public static void main(String[] args) {
        int V=100;
        String input="0 1 0 2 0 3 1 2 3 4 3 5 3 6 4 5 5 6 5 7 7 8 8 9 8 10 8 11 11 12 11 13 11 14 13 14 13 15 14 15 14 16 14 17 " +
                "17 18 17 19 18 19 18 20 19 20 21 22 21 23 21 24 22 23 24 25 24 26 24 27 28 29 28 30 31 32 31 33 31 34 33 34 33 35 " +
                "34 36 34 37 35 36 35 37 35 38 37 38 37 39 39 40 39 41 40 41 41 42 41 43 41 44 42 43 42 45 45 46 45 47 45 48 48 49 " +
                "50 52 51 52 53 54 53 56 54 55 54 56 54 57 56 57 56 58 62 63 64 65 64 66 64 67 66 67 67 69 67 70 69 70 69 71 69 72 " +
                "73 75 73 76 75 76 76 77 76 78 78 79 78 80 79 80 79 81 79 82 80 81 81 82 81 83 82 83 82 84 84 85 84 86 84 87 86 87 " +
                "87 88 88 89 88 90 88 91 89 90 89 92 90 91 90 92 93 94 93 95 94 95 94 96 94 97 95 96 95 97 96 97 96 98 96 99";

        LinkedList<Integer> adjList[]=new LinkedList[V];
        for (int i = 0; i < adjList.length; i++) adjList[i]=new LinkedList<>();
        String s[]=input.split("\\s+");
        for (int i = 0; i < s.length; i+=2){
            int v1=Integer.parseInt(s[i]);
            int v2=Integer.parseInt(s[i+1]);
            adjList[v1].add(v2);
            adjList[v2].add(v1);
        }
        int groups[]=connected(adjList, V);
        System.out.println(Arrays.toString(groups));
        System.out.println(isFriend(groups,1,4));
        System.out.println(isFriend(groups,5,9));
        // input="0 1 2 3 3 4 5 6 6 7 7 8 8 9 4 5";
    }

    private static int[] connected(LinkedList<Integer>[] adjList, int v) {
        int[] w = new int[v];
        int groupId = 0;
        for (int i=0; i<v; i++) {
            if (w[i] == 0) dfs(adjList, v, w, i, ++groupId);
        }
        return w;
    }

    private static void dfs(LinkedList<Integer>[] adjList, int V, int[] w, int v, int groupId) {
        w[v]=groupId;
        for (Integer i : adjList[v]) {
            if(w[i]==0) dfs(adjList, V, w, i, groupId);
        }
    }

    private static boolean isFriend(int[] groups, int i, int j) {
        return groups[i] == groups[j];
    }
}
