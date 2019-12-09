package src.Queue;

public class Queue {
    public boolean justAdded;//so that when runningTally is 0, new items
    public long runningTally; //in checkout program, use to track how far
    //the checker is with the customer's order
    //aren't deleted right away.
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long s) {
        if (rear == maxSize - 1)
            rear = -1;
        queArray[++rear] = s;
        nItems++;
    }

    public long remove() {
        //if (isEmpty() == true) System.out.println("It empty.");
        long temp = queArray[front++];
        if (front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }

    public long peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

    public int size() {
        return nItems;
    }

    public void display() {
        for (int i = 0; i < maxSize; i++) {
            System.out.print(queArray[i] + " ");
        }
    }

    public long itemAt(int i) {
        return queArray[i];
    }
}

