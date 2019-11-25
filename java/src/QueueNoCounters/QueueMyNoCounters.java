package src.QueueNoCounters;

public class QueueMyNoCounters {
    private int maxSize;
    private long[] arrayMy;
    private int start;
    private  int end;

    public QueueMyNoCounters(int s){
        maxSize = s+1;
        arrayMy = new long[maxSize];
        start = 0;
        end = -1;
    }

    public void  insert(long k){
        if(end == maxSize-1)
            end = -1;
        arrayMy[++end] = k;
    }

    public long remove(){
        long temp = arrayMy[start++];
        if(start == maxSize)
            start = 0;
        return temp;
    }

}
