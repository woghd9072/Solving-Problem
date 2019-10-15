package Ch4;

import java.util.Arrays;
import java.util.Stack;

class Point {
    private int index;
    private int value;

    public Point(int index, int value) {
        this.index = index;
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public int getValue() {
        return value;
    }
}

public class Test19_B {
    public static void main(String[] args) {
        int price[]= {100,90,80,70,85,95,110,120};
        int span[]=new int[price.length];
        Stack<Point> stack = new Stack<>();
        span[0] = 1;
        stack.push(new Point(0, price[0]));

        for (int i=0; i<price.length; i++) {
            while (!stack.isEmpty()) {
                if (stack.peek().getValue() > price[i]) {
                    span[i] = i - stack.peek().getIndex();
                    break;
                }
                stack.pop();
            }
            stack.push(new Point(i, price[i]));
            if (stack.size() == 1) span[i] = i+1;
        }
        System.out.println(Arrays.toString(span));
    }
}
