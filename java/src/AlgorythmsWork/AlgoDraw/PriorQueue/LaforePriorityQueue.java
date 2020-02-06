package src.AlgorythmsWork.AlgoDraw.PriorQueue;

public class LaforePriorityQueue {
    SortedList queList;

    public LaforePriorityQueue(){

        queList = new SortedList();
    }

    public  void insert(long value){
        queList.insert(value);
    }

    public Link remove(){ //removes link with the smallest key
        if(queList.isEmpty()){
            System.out.println("Queue is empty.");
            return null;
        }
        return queList.remove();
    }

    public long peekMin(){
        return queList.getFirst();
    }

    public boolean isEmpty() {
        return queList.isEmpty();
    }

    public void display() {
        queList.displayList();
    }

}
