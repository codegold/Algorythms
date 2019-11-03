package src.LowArray;

public class LowArray {
    private long[] a;
    private long[] a2 = new long[10];

    public LowArray(int size) {
        a = new long[size];
    }

    public void setElem(int index, long value) {
        a[index] = value;
    }

    public long getElem(int index) {
        return a[index];
    }


}
