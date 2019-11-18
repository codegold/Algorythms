package src.BubbleSort;

public class ArrayBub {
    private long[] a;
    private int nElems;

    public ArrayBub(int max) {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int i = 0; i < nElems; i++)
            System.out.print(a[i] + " ");
        System.out.println();

    }

    public void bubbleSort() {
        int in, out;
        for (out = nElems - 1; out > 1; out--)
            for (in = 0; in < out; in++)
                if (a[in] > a[in + 1])
                    swap(in, in + 1);
    }

    public void bubbleSortReverse(){
        int in, out;
        for (out = 0; out < nElems; out++)
            for (in = nElems -1;  in > out ; in --)
                if(a[in] > a[in - 1])
                    swap(in, in-1);
    }


    private void swap(long one, long two) {
        long temp = a[(int) one];
        a[(int) one] = a[(int) two];
        a[(int) two] = temp;
    }

    public void fulfillArray() {
        int min = 100;
        int max = 200;

        for (int i = 0; i < 10; i++) {
            int random = 80 + (int) (Math.random() * 15);
            a[nElems] = random;
            nElems++;
        }
    }

    public void bubbleSortMy() {
        int i;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (i = 1; i < a.length; i++) {
                if (a[i] < a[i - 1]) {
                    swap(a[i], a[i - 1]);
                    isSorted = false;
                }
            }
        }
    }

    public void bubbleSortThree() {
        for (int i = 0; i < nElems - 1; i++) {
            for (int j = 0; j < nElems - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = (int) a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }

            }
        }
    }
}
