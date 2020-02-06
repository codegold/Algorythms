package src.AlgorythmsWork.AlgoDraw.CycleLinkedList;

public class CLink {
    public long dData;
    public CLink next;

    public CLink(long value) {
        dData = value;
    }

    public void displayCLink() {
        System.out.println(dData + " ");
    }
}
