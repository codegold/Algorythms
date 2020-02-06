package src.AlgorythmsWork.AlgoDraw.InterIterator2;

public class ListIterator {
    private Link current;
    private Link previous;
    private LinkList ourList;

    public ListIterator(LinkList list){
        ourList = list;
        reset();
    }

    public void reset() {
        current = ourList.getFirst();
        previous = null;
    }

    public boolean atEnd(){
        return current.next == null;
    }


}
