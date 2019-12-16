package src.LinkQueue;

public class FirstClassLInk {
    private Link first;
    private Link last;

    public FirstClassLInk() {
        first = null;
        last = null;
    }

    boolean isEmpty() {
        return (first == null);
    }

    public void insertLast(long dd) {
        Link newLink = new Link(dd);
        if (isEmpty())
            first = newLink;
        else
            last = last.next;
        last = newLink;
    }
}
