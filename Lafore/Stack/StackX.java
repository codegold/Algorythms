package Stack;

public class StackX {
    private int maxSixe;
    private int[] stackArray;
    private int top;

//----------------------------------------------------------------

    public StackX(int s) {                           //Constructor
        maxSixe = s;
        stackArray = new int[maxSixe];
        top = -1;
    }
//----------------------------------------------------------------

    public void push(int j) {    //Put element on top of the stack

        stackArray[++top] = j;
    }
//----------------------------------------------------------------

    public int pop() {                 //Take out element from top

        return stackArray[top--];
    }
//----------------------------------------------------------------

    public int peek() {                         //Reading from top

        return stackArray[top];
    }
//----------------------------------------------------------------

    public boolean isEmpty() {               //True of stack empty

        return (top == -1);
    }

    //------------------------------------------------------------

    public boolean isFull() {                 //True if stack full

        return (top == maxSixe - 1);
    }
}
