package src.InsertSort;

import static src.BubbleSort.MyBubbleSort.swap;

public class ArrayIns {
    private long[] a;
    private int nElems;

    public ArrayIns(int maxSize) {
        a = new long[maxSize];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void insertionSort(){
        for (int i = 1; i < nElems; i++) {
            int m = i;
            while (m > 0 && a[m]> a[m -1]){
                int temp = (int) a[m];
                a[m] = a[m-1];
                a[m-1] = temp;
                m--;
            }
        }
    }
}
