package src.Brackets;

public class StackX {
    private int maxSize;
    private char[] charArray;
    private int top;

    public StackX(int i) {
        maxSize = i;
        charArray = new char[maxSize];
        top = -1;
    }

    public void push(char j) {
        charArray[++top] = j;
    }

    public char pop() {
        return charArray[top--];
    }

    public char peek() {
        return charArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
