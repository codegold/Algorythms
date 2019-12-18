package src.DoublyLinked;

public class DoublyLinkedList {
    private Link first;
    private Link last;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(long key) {
        Link newLink = new Link(key);
        if (isEmpty())
            last = newLink;
        else
            first.previous = newLink;
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(long key) {
        Link newLink = new Link(key);
        if (isEmpty())
            first = newLink;
        else {
            last.next = newLink;
            newLink.previous = last;
        } //Why curly here?
        last = newLink;
    }

    public Link deleteLast() {
        Link temp = last;
        if (first.next == null) //If only one elem;
            first = null;
        else
            last.previous.next = null;
        last = last.previous;
        return temp;
    }

    public boolean insertAfter(long key, long dd) {
        Link current = first;
        while (current.dData != key) {
            current = current.next;
            if (current == null)
                return false;
        }
        Link newLink = new Link(dd);
        if (current == last) {
            newLink.next = null;
            last = newLink;
        } else {
            newLink.next = current.next;
            current.next.previous = newLink;
        }
        newLink.previous = current;
        current.next = newLink;
        return true;
    }
}
