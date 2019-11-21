package src.Stack;

public class StackX {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public StackX(int s) {
        maxSize = s; //define size
        stackArray = new long[maxSize]; //init array
        top = -1;
    }

    public void push(long j) { // put elem on the top
        stackArray[++top] = j;

    }

    public long pop() {
        return stackArray[top--]; //extraction elem & reduce top
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

}
