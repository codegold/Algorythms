package src.AlgorythmsWork.AlgoDraw.LinkStack;

public class LinkList {
    private Link first;

    public LinkList() {
        this.first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(long dd){
        Link newLink = new Link(dd);
        newLink.next = first;
        first = newLink;
    }

    public long deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp.dData;
    }

    public void displayList(){
        Link current = first;
        while (current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}
