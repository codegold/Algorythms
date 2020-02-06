package src.AlgorythmsWork.AlgoDraw.LinkStack;

public class Link {
    public long dData;
    public Link next;

    public Link(long dd) {

        this.dData = dd;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}
