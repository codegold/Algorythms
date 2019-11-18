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

    public void insertionSort() {
        for (int i = 1; i < nElems; i++) {
            int m = i;
            while (m > 0 && a[m] > a[m - 1]) {
                int temp = (int) a[m];
                a[m] = a[m - 1];
                a[m - 1] = temp;
                m--;
            }
        }
    }

    public void insertionSortNoDups() {
        insertionSort();
        int total = nElems;
        int shiftAmount = 0;
        long currNum = 0;
        for (int index = 0; index < total; index++) {
            if (a[index] == currNum) {
                shiftAmount++;
                nElems--;
            } else {
                currNum = a[index];
                a[index - shiftAmount] = a[index];
            }

        }
        display();

    }

    public void noDups() {
        insertionSort();
        for (int i = 0; i < nElems; i++)
            while (a[i] == a[i + 1]) {
                for (int j = i + 1; j < nElems; j++)
                    a[j] = a[j + 1];
                nElems--;
            }
    }
}
