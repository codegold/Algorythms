package src.QueueNoCounters;

public class QueueMyNoCounters {
    private int maxSize;
    private long[] arrayMy;
    private int start;
    private int end;

    public QueueMyNoCounters(int s) {
        maxSize = s + 1;
        arrayMy = new long[maxSize];
        start = 0;
        end = -1;
    }

    public void insert(long k) {
        if (end == maxSize - 1)
            end = -1;
        arrayMy[++end] = k;
    }

    public long remove() {
        long temp = arrayMy[start++];
        if (start == maxSize)
            start = 0;
        return temp;
    }

    public long peek() {
        return arrayMy[start];
    }

    public boolean isEmpty() {
        return (end + 1 == start || (start + maxSize - 2 == end));
    }

    public int size() {
        if (end > -1) return end - start + 1;
        else return (maxSize - start) + (end + 1);
    }

}
