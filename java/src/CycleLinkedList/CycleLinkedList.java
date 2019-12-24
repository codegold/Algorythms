package src.CycleLinkedList;

public class CycleLinkedList {
    private CLink current;
    private int nItems; //keeps length of the list

    public CycleLinkedList() {
        current = null;
        nItems = 0;
    }

    public boolean isEmpty() {
        return current == null;
    }

    public long getItems() {
        return nItems;
    }

    public void step() {
        current = current.next;
    }

    public void insert(long value) {

        if (!isEmpty()) {
            current = new CLink(value);
            current.next = current;

        } else {
            CLink newCLink = new CLink(value);
            newCLink.next = current.next;
            current.next = newCLink;
        }
        nItems++;
    }

    public CLink delete() {

        if (isEmpty()) {
            System.out.println("List is empty.");
            return null;

        } else if (nItems == 1) {
            current = null;
            nItems = 0;
            return null;

        } else {
            CLink temp = current.next;
            current.next = current.next.next;
            nItems--;
            return temp;
        }
    }

    public CLink peek() {

        if (!isEmpty()) {
            return current;
        } else
            System.out.println("List is empty.");
        return null;
    }

    public void display() {

        System.out.println("Display from current.");
        CLink index = current;
        for (int i = 0; i < nItems; i++) {
            System.out.println(index.dData + " ");
            index = index.next;
        }
        System.out.println("");
    }
}

