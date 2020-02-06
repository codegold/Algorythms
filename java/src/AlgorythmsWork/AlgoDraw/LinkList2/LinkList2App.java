package src.AlgorythmsWork.AlgoDraw.LinkList2;

public class LinkList2App {
    public static void main(String[] args) {
        LinkList theList = new LinkList();
        int count = 0;
        while (true) {
            for (int i = 0; i < 1000; i++) {
                theList.insertFirst(11, 11.9);
                count++;
            }
            System.out.println("Counter: " + count);

           // theList.displayList();
//            theList.insertFirst(22, 2.99);
//            theList.insertFirst(44, 4.99);
//            theList.insertFirst(66, 6.99);
//            theList.insertFirst(88, 8.99);

        }
//        Link f = theList.find(22);
//        if (f != null)
//            System.out.println("Found link with key " + f.iData);
//        else
//            System.out.println("Can't find link");
//
//        Link d = theList.delete(44);
//        if (!(d == null))
//            System.out.println("Delete link with key " + d.iData);
//        else
//            System.out.println("Can't find link");
//
//        theList.displayList();
    }
}
