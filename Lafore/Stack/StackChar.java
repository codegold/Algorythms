package Stack;

public class StackChar {
    private int maxSixe;
    private char[] stackCharArray;
    private int top;

//----------------------------------------------------------------

    public StackChar(int s) {                           //Constructor
        maxSixe = s;
        stackCharArray = new char[maxSixe];
        top = -1;
    }
//----------------------------------------------------------------

    public void push(char j) {    //Put element on top of the stack

        stackCharArray[++top] = j;
    }
//----------------------------------------------------------------

    public char pop() {                 //Take out element from top

        return stackCharArray[top--];
    }
//----------------------------------------------------------------

    public char peek() {                         //Reading from top

        return stackCharArray[top];
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
