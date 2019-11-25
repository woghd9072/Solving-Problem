package Ch11;

import java.util.LinkedList;

public class Test02 {
    public static void main(String[] args) {
        int V=8;
        String input="0 1 0 3 1 2 3 2 3 4 2 5 4 5 6 7";
        LinkedList<Integer> adjList[]=new LinkedList[V];
        for (int i = 0; i < adjList.length; i++){
            adjList[i]=new LinkedList<>();
        }
        String s[]=input.split("\\s+");
        for (int i = 0; i < s.length; i+=2){
            int v1=Integer.parseInt(s[i]);
            int v2=Integer.parseInt(s[i+1]);
            adjList[v1].add(v2);
        }
        for (int i = 0; i < adjList.length; i++){
            System.out.println("node "+i+" => "+adjList[i]);
        }
    }
}
