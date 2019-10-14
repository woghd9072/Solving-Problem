package Ch4;

import java.util.Arrays;

public class SimpleStack {

    int DefaultSize=1;
    int MaxSize;
    int stack[];
    int top=-1;

    public SimpleStack() {
        stack=new int[DefaultSize];
        MaxSize=DefaultSize;
    }

    public void push(int data) {
        if(full()){
            MaxSize*=2;
            stack=Arrays.copyOf(stack, MaxSize);
        }
        stack[++top]=data;
    }

    private boolean full() {
        return top==MaxSize-1;
    }

    @Override
    public String toString() {
        return "top="+top+", stack="+Arrays.toString(stack);
    }

    public int pop() {
        if(empty()) throw new RuntimeException("stack empty");
        return stack[top--];
    }

    private boolean empty() {
        return top==-1;
    }

    public int peek() {
        if(empty()) throw new RuntimeException("stack empty");
        return stack[top];
    }
}
