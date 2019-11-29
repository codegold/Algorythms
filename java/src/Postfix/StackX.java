package src.Postfix;

public class StackX {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackX(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int j) {
        stackArray[++top] = j;
    }

    public int pop() {
        return stackArray[top--];
    }

    public int peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public int size() {
        return top + 1;
    }

    public int peekN(int j) { //read elem by index
        return stackArray[j];
    }

    public void displayStack(String s) {
        System.out.print(s);
        System.out.print("Stack (bottom --> top): ");
        for (int i = 0; i < size(); i++) {
            System.out.print(peekN(i));
        }
        System.out.println();
    }
}


