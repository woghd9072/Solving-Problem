package Ch4;

import java.util.LinkedList;

public class Test01 {
    public static void main(String[] args) {
        LinkedList<Integer> stack=new LinkedList<>();
        stack.addLast(1);
        stack.addLast(2);
        stack.addLast(3);
        System.out.println("스택 전체 내용: "+stack);
        System.out.println("스택 크기="+stack.size());
        System.out.println("스택이 비어 있는가? "+stack.isEmpty());
        int v;
        v=stack.getLast();
        System.out.println("스택 top 위치 자료 확인="+v);
        v=stack.removeLast();
        System.out.println("스택 top 위치 자료 제거="+v);
        System.out.println("스택 전체 내용: "+stack);
        System.out.println("스택 top 위치 자료 제거="+stack.pop());
        System.out.println("스택 전체 내용: "+stack);
        System.out.println("스택 top 위치 자료 제거="+stack.pop());
        System.out.println("스택 전체 내용: "+stack);
        System.out.println("스택이 비어 있는가? "+stack.isEmpty());
    }
}
