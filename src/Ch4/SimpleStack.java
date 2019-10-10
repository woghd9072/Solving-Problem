package Ch4;

import java.util.Arrays;

public class SimpleStack {

    int stack[];
    int top = -1;

    public SimpleStack(int size) {
        stack = new int[size];
    }

    public void push(int data) {
        stack[++top]=data;
    }

    public int pop() {
        return stack[top--];
    }

    @Override
    public String toString() {
        return "top="+top+", stack="+ Arrays.toString(stack);
    }
}
