package Ch11;

import java.util.Arrays;
import java.util.LinkedList;

public class Test07_2 {
    public static void main(String[] args) {
        String input="0 1 0 2 0 3 1 4 1 5 2 5 2 6 3 6 3 7 3 8 4 9 5 9 6 9 6 10 7 10 8 10 9 11 10 11";
        int V=12;

        LinkedList<Integer> adjList[]=new LinkedList[V];
        for (int i = 0; i < adjList.length; i++) adjList[i]=new LinkedList<>();
        String s[]=input.split("\\s+");
        for (int i = 0; i < s.length; i+=2){
            int v1=Integer.parseInt(s[i]);
            int v2=Integer.parseInt(s[i+1]);
            adjList[v1].add(v2);
            adjList[v2].add(v1);
        }
//        bfs(adjList, V, 0);
        int start=0, end=10;
        bfs(adjList, V, start, end);
    }
    private static void bfs(LinkedList<Integer>[] adjList, int V, int start, int end){
        boolean visited[]=new boolean[V];
        double dist[]=new double[V];
        int prev[]=new int[V];
        for (int i = 0; i < dist.length; i++) dist[i]=Double.MAX_VALUE;
        for (int i = 0; i < prev.length; i++) prev[i]=-1;
        LinkedList<Integer> queue=new LinkedList<>();
        visited[start]=true;
        dist[start]=0;
        queue.addLast(start);
        while(!queue.isEmpty()){
            int v=queue.removeFirst();
            for (Integer w : adjList[v]) {
                if(visited[w]==false){
                    visited[w]=true;
                    dist[w]=dist[v]+1;
                    prev[w]=v;
                    queue.addLast(w);
                }
            }
        }
        System.out.println("dist => "+Arrays.toString(dist));
        System.out.println("prev => "+ Arrays.toString(prev));
    }
}
