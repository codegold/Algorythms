package Stack;

public class StackX {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackX(int s) {
        maxSize = s;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int j) {
        stackArray[++top] = j;
    }
}
