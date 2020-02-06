package src.AlgorythmsWork.AlgoDraw.BinarySearch;

public class ordArray {
    private long[] a; //link to array
    private int nElens;//num of items

    public ordArray(int max) {
        a = new long[max];
        nElens = 0;
    }

    public int size() {
        return nElens;
    }

    public int find(long searchKey) {
        return recFind(searchKey, 0, nElens - 1);
    }

    private int recFind(long searchKey, int lowerBound, int upperBound) {
        int curIn;

        curIn = (lowerBound + upperBound) / 2;
        if (a[curIn] == searchKey)
            return curIn;
        else if (lowerBound > upperBound)
            return nElens;
        else {
            if (a[curIn] < searchKey)
                return recFind(searchKey, curIn + 1, upperBound);
            else
                return recFind(searchKey, lowerBound, curIn - 1);
        }
    }

    public void insert(long value) {
        int j;
        for (j = 0; j < nElens; j++) {
            if (a[j] > value) break;
        }
        for (int k = nElens; k > j; k--) {
            a[k] = a[k - 1];
        }
        a[j] = value;
        nElens++;

    }

    public void display() {
        for (int j = 0; j < nElens; j++)
            System.out.print(a[j] + " ");
        System.out.println();
    }
}


