package src.AlgorythmsWork.AlgoDraw.Josephus;

import src.AlgorythmsWork.AlgoDraw.CycleLinkedList.CLink;
import src.AlgorythmsWork.AlgoDraw.CycleLinkedList.CycleLinkedList;

public class Josephus {
    private CycleLinkedList theList;
    private int count;
    private int people;

    public Josephus(int nPeople, int nCount, int startPoint) {

        theList = new CycleLinkedList();
        count = nCount;
        people = nPeople;

        for (int i = 1; i < nPeople; i++) {

            theList.insert(i);
            theList.step();
        }

        theList.step(); //starting @ 1

        for (int i = 1; i < startPoint; i++) {
            theList.step(); //move step by step to starting person
        }
    }

    private void display() {
        theList.display();
    }

    //steps through list by count and removes an item
    private CLink kill() {
        for (int i = 0; i < count - 1; i++) { //count-1 because CList deletes item AFTER list.current
            theList.step();
        }
        CLink temp = theList.delete();
        System.out.println("Killed # " + temp.dData);
        theList.step(); //move to person left of killed person
        return temp;
    }

    public CLink execute() { //runs through entire sequence
        CLink temp = new CLink(0);
        for (int i = 0; i < people - 1; i++) {
            display();
            temp = kill();
        }
        System.out.println("Last person left is # " + temp.next.dData);
        return temp;
    }

}
