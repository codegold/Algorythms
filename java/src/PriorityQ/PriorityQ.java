package src.PriorityQ;

public class PriorityQ {
    private int maxSize;
    private long[] queArray;
    private int nElems;

    protected PriorityQ(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        nElems = 0;
    }

    public void insert(long item) {
        int j;
        if (nElems == 0) { //if no elems
            queArray[nElems++] = item; //insert to Zero index
        } else {
            for (j = nElems - 1; j >= 0; j--) {
                if (item > queArray[j])
                    queArray[j + 1] = queArray[j];
                else
                    break;
            }
            queArray[j + 1] = item;
            nElems++;
        }
    }

    public void insertQuick(long item) {
        if (!isFull()) {
            System.out.println("It's full");
        } else {
            queArray[nElems] = item;
            nElems++;
        }
    }

    public long remove() {
        return queArray[--nElems];
    }

    public long removeSlow() {
        if (isEmpty()) {
            System.out.println("It's empty.");
            return -1;
        }
        int minIndex = 0;
        for (int i = 0; i < nElems; i++)
            if (queArray[i] < queArray[minIndex]) ;

        //store the minimum value for return later
        long temp = queArray[minIndex];

        //shift all entries down and decrement nItems
        for (int j = minIndex; j < ; j++) {

        }
    }

    public long peekMin() {
        return queArray[nElems - 1];
    }

    public boolean isEmpty() {
        return (nElems == 0);
    }

    public boolean isFull() {
        return (nElems == maxSize);
    }
}
