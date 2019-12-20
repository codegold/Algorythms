package src.InterIterator2;

public class LinkList {
    private Link first;

    public LinkList() {
        first = null;
    }

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link f) {
        first = f;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public ListIterator getIterator() {
        return new ListIterator(this);
    }

    public void displayList() {
        Link curr = first;
        while (curr!=null){
            curr.displayLink();
            curr = curr.next;
        }
        System.out.println();
    }
}
