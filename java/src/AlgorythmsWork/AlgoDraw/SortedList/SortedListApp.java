package src.AlgorythmsWork.AlgoDraw.SortedList;

public class SortedListApp {
    public static void main(String[] args) {
        SortedList theSortedList = new SortedList();
        theSortedList.insert(22);
        theSortedList.insert(44);

        theSortedList.displayList();

        theSortedList.insert(11);
        theSortedList.insert(33);
        theSortedList.insert(55);

        theSortedList.displayList();

        theSortedList.remove();

        theSortedList.displayList();
    }
}
