package src.LinkList2;

public class LinkList2App {
    public static void main(String[] args) {
        LinkList theList = new LinkList();
        theList.insertFirst(22, 2.99);
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 8.99);

        theList.displayList();

        Link f = theList.find(22);
        if (f != null)
            System.out.println("Found link with key " + f.iData);
        else
            System.out.println("Can't find link");

        Link d = theList.delete(44);
        if (!(d == null))
            System.out.println("Delete link with key " + d.iData);
        else
            System.out.println("Can't find link");

        theList.displayList();
    }
}
