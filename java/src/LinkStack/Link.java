package src.LinkStack;

public class Link {
    private long dData;
    public Link next;

    public Link(long dData) {
        this.dData = dData;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}
