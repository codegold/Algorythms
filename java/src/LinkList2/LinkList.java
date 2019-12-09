package src.LinkList2;

public class LinkList {
    private Link first;

    public LinkList() {
        this.first = null;
    }

    public void insertFirst(int id, double dd) {
        Link newLink = new Link(id, dd);
        newLink.next = first;
        first = newLink;
    }

    public Link find(int key) {
        Link current = first;
        while (current.iData != key) {
            if (current.next == null)
                return null;
            else current = current.next;
        }
        return current;
    }

    public Link delete(int key) {
        Link current = first;
        Link previous = first;
        while (current.iData != key) {
            if (current.next == null)
                return null;
            else {
                previous = current;
                current = current.next;
            }
        }
    if(current == first)
        first = first.next;
        else
            previous.next = current.next;
        return current;
    }
}
