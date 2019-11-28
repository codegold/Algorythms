package src.infix;

public class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackX(int s) {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j) { //put on top
        stackArray[++top] = j;
    }

    public char pop() {
        return stackArray[top--]; //extract elem from top
    }

    public char peek() {
        return stackArray[top]; // read elem from top
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int size() {
        return top + 1;
    }

    public char peekN(int n){
        return stackArray[n];
    }

    public void displayStack(String s){
        System.out.print(s);
        System.out.print("Stack (bottom --> top): ");
        for (int i = 0; i < size(); i++) {
            System.out.print(peekN(i));
            System.out.print(' ');
        }
        System.out.println("");
    }
}
