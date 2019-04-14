package Stack;

public class StackApp {
    public static void main(String[] args) {
        StackX theStack = new StackX(10);          //Create new stack
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        while (!theStack.isEmpty()) {          //While  not become empty
            int value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
