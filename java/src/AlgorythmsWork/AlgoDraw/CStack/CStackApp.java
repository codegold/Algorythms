package src.AlgorythmsWork.AlgoDraw.CStack;

public class CStackApp {
    public static void main(String[] args) {
        CStack theStack = new CStack();
        theStack.push(1);
        theStack.push(5);
        theStack.push(8);
        theStack.push(2);

        System.out.println(theStack.pop());
        System.out.println(theStack.pop());
        System.out.println(theStack.pop());
        System.out.println(theStack.pop());
    }
}
