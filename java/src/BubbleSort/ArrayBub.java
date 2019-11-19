package src.BubbleSort;

import static src.BubbleSort.MyBubbleSort.swap;

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

    public void bubbleSortReverse() {
        int in, out;
        for (out = 0; out < nElems; out++)
            for (in = nElems - 1; in > out; in--)
                if (a[in] > a[in - 1])
                    swap(in, in - 1);
    }

    public void doubleDirBubbleSort() {
        int outTop = nElems - 1;
        int outBottom = 0;
        int in;
        while (outBottom < outTop) {
            for (in = outTop; in > 0; in--)
                if (a[in - 1] > a[in]) swap(in - 1, in);
            outBottom++;
            for (in = outBottom; in < outTop; in++)
                if (a[in] > a[in + 1]) swap(in, in + 1);
            outTop--;
        }
    }

    public void oddEvenSort() {
        int even, odd;
        int numEvenOddLoops = nElems / 2;
        while (numEvenOddLoops > 0) {
            if (nElems % 2 == 0) {
                for (even = 0; even < nElems - 1; even += 2) {
                    if (a[even] > a[even + 1]) {
                        swap(even, even + 1);
                    }
                }
                for (odd = 1; odd < nElems - 2; odd += 2) {
                    if (a[odd] > a[odd + 1]) {
                        swap(odd, odd + 1);
                    }
                }
            } else {
                for (even = 0; even < nElems - 2; even += 2) {
                    if (a[even] > a[even + 1]) {
                        swap(even, even + 1);
                    }
                }
            }
            for (odd = 1; odd < nElems - 1; odd += 2) {
                if (a[odd] > a[odd + 1]) {
                    swap(odd, odd + 1);
                }
            }
            numEvenOddLoops--;
        }

    }


    public void oddEvenSortMyThree() {

        int odd, even;
        int loopsCount = nElems / 2;

        while (loopsCount > 0) {
            if (loopsCount % 3 == 0) {
                for (even = 1; even < a.length - 1; even += 2) {
                    if (a[even] > a[even + 1])
                        swap(even, even + 1);
                }
                for (odd = 0; odd < a.length - 2; odd += 2) {
                    if (a[odd] > a[odd + 1])
                        swap(odd, odd + 1);
                }
            }
            if (loopsCount % 2 == 0) {
                for (even = 1; even < a.length - 1; even += 2) {
                    if (a[even] > a[even + 1])
                        swap(even, even + 1);
                }
                for (odd = 0; odd < a.length - 2; odd += 2) {
                    if (a[odd] > a[odd + 1])
                        swap(odd, odd + 1);
                }
            }
            else {
                for (even = 0; even < a.length - 2; even += 2) {
                    if (a[even] > a[even + 1])
                        swap(even, even + 1);
                }
                for (odd = 1; odd < a.length - 1; odd += 2) {
                    if (a[odd] > a[odd + 1])
                        swap(odd, odd + 1);
                }
            }
            loopsCount--;
        }
    }

    public void oddEvenSortMyTwo() {
        int odd, even;
        int loopsCount = nElems / 2;

        while (loopsCount > 0) {
            for (even = 1; even < a.length - 1; even += 2) {
                if (a[even] > a[even + 1])
                    swap(even, even + 1);
            }
            for (odd = 0; odd < a.length - 2; odd += 2) {
                if (a[odd] > a[odd + 1])
                    swap(odd, odd + 1);
            }
            loopsCount--;
        }
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
