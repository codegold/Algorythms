package src.FirstLastList;

public class FirstLastLink {
    private Link first;
    private Link last;

    public FirstLastLink() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(long dd) {
        Link newLink = new Link(dd);
        if (isEmpty())
            last = newLink;
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(long dd) {
        Link newLink = new Link(dd);
        if (isEmpty())
            first = newLink;
        else
            last.next = newLink;
    }

    public long deleteFirst() {
        long temp = first.dData;
        if (first.next == null)
            last = null;
        first = first.next;
        return temp;
    }

    public void displayLink() {
        System.out.print("List (first-->last): ");
        Link current = first;
        while (current!= null){
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}
