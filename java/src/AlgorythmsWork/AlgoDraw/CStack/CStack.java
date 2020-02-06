package src.AlgorythmsWork.AlgoDraw.CStack;

import src.AlgorythmsWork.AlgoDraw.CycleLinkedList.CycleLinkedList;

import java.util.EmptyStackException;

public class CStack {
    private CycleLinkedList theList;

    public CStack() {

        theList = new CycleLinkedList();
        theList.insert(-1);//the first element is an anchor
        //not used in stack operations
    }

    public void push(long value) {
        theList.insert(value);
    }

    public long pop() {
        if (theList.getItems() == 1) {
            System.out.println("Stack is empty");
            throw new EmptyStackException();
        } else {
            return theList.delete().dData;
        }
    }

    public long peek() {
        return theList.peek().dData;
    }
}
