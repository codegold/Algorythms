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
        if (nElems == 0) {
            queArray[nElems++] = item;
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

    public long remove() {
        return queArray[--nElems];
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
