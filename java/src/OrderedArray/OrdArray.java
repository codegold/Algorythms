package src.OrderedArray;

public class OrdArray {
    private int[] a;
    private int nElems;

    public OrdArray(int value) {
        a = new int[value];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    public int find(int searchKey) {
        int startLimit = 0;
        int endLimit = nElems - 1;
        int curr;

        while (true) {
            curr = (startLimit + endLimit) / 2;
            if (a[curr] == searchKey)
                return curr;
            else if (startLimit > endLimit)
                return nElems;
            else {
                if (a[curr] < searchKey)
                    startLimit = curr + 1;
                else
                    endLimit = curr - 1;

            }
        }
    }

    public void insert(int value) {
        int start = 0;
        int end = nElems - 1;
        int curr = 0;

        while (true) {

            if (start > end) break;
            curr = (start + end) / 2;
            if (value > a[curr]) {
                start = curr + 1;
                curr++;

            } else end = curr - 1;
        }

        for (int k = nElems; k > curr; k--)
            a[k] = a[k - 1];

        a[curr] = value;
        nElems++;
    }

    public void simpleInsert(int value) {
        for (int i = 0; i < nElems; i++)
            if (a[i] > value) break;

        a[nElems] = value;
        nElems++;

    }

    public boolean delete(int value) {
        int j = find(value);
        int start = 0;
        int end = nElems - 1;
        int curr = (start + end) / 2;

        if (value == nElems) return false; // can’t find it
        else {
            if (curr == j)
                return true;
            else if (start > end) return false;
            else {
                if (a[curr] > j) end = curr - 1;
                else start = curr + 1;
            }
            for (int k = j; k < nElems; k++)
                a[k] = a[k + 1];
            nElems--;
            return true;
        }
    }

    public void display() {
        for (int i = 0; i < nElems; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public void merge() {

    }



}
