package src.CycleLinkedList;

public class CLink {
    public long dData;
    public CLink next;

    public CLink(long value) {
        this.dData = value;
    }

    public void displayCLink() {
        System.out.println(dData + " ");
    }
}
