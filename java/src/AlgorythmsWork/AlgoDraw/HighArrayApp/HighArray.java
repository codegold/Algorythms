package src.AlgorythmsWork.AlgoDraw.HighArrayApp;

public class HighArray {
    private long[] a;
    private int nElems;
    private long[] arrForAlgo = a;
    private int nElemsForAlgo = nElems;

    public HighArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    public boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (a[j] == searchKey) break;
        }
        if (j == nElems) return false;
        else return true;
    }

    public void insert(long value) {
        int end = nElems - 1, start = 0, cur = (start + end) / 2;
        for (int i = 0; i < nElems; i++) {

        }
        a[nElems] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++)
            if (value == a[j]) break;
        if (j == nElems) return false;
        else {
            for (int k = j; k < nElems; k++)
                a[k] = a[k + 1];
            nElems--;
            return true;
        }
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println();
    }

    public int findWithBinary(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curr;

        while (true) {
            curr = (lowerBound + upperBound) / 2;
            if (searchKey == a[curr])
                return curr;
            else if (lowerBound > upperBound)
                return Integer.parseInt("not found");
            else {
                if (a[curr] > searchKey) upperBound = curr - 1;
                else lowerBound = curr + 1;
            }
        }
    }

    public void removeMax() {
        long cont = 0;
        int i, j = 0;
        if (nElems > 0) {
            for (i = nElems - 1; i > 0; i--)
                for (j = 0; j < i; j++)
                    if (a[i] < a[j]) {
                        cont = a[i];
                        a[i] = a[j];
                        a[j] = cont;
                    }
        }
        nElems--;
    }

    public void removeMaxTwo() {
        long biggest = Integer.MIN_VALUE;
        for (int i = 0; i < nElems; i++) {
            if (a[i] > biggest) biggest = a[i];
        }
        delete(biggest);
    }
}