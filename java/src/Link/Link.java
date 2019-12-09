package src.Link;

public class Link {
    public int iData;
    public double dData;
    public Link next; //для наглядности его можно явно инициализировать null

    public Link(int id, double dd) {
        iData = id;
        dData = dd;
    }

    public void displayLink() {
        System.out.print("{" + iData + ". " + dData + "} ");
    }
}
