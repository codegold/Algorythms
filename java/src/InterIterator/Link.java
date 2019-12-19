package src.InterIterator;

public class Link {
    public long dData;
    public Link Next;

    public Link(long dd){
        dData = dd;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }

}
