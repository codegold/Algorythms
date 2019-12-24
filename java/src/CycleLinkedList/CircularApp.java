package src.CycleLinkedList;

public class CircularApp {
    public static void main(String[] args) {
        CycleLinkedList theList = new CycleLinkedList();
        theList.insert(1);
        theList.insert(2);
        theList.insert(3);
        theList.insert(4);

        theList.display();

        theList.delete();
        theList.display();
        theList.delete();
        theList.display();
    }
}
