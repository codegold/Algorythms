package src.OrderedArray;

import com.sun.istack.internal.NotNull;

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

    public void sortMy(int[] a) {
        for (int i = a.length; i > 0; i--)
            for (int j = i - 1; j > 0; j--)
                if (a[j] > a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
    }


    public void display() {
        for (int i = 0; i < nElems; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }


    public static OrdArray merge(OrdArray a, OrdArray b) {
        int myLength = a.size() + b.size(); //Set needed length.

        OrdArray newArray = new OrdArray(myLength * 2); //Create max size for future array
        int i = 0, j = 0, k = 0; //Three counters?

        while (j < a.size() && k < b.size()) {

            if (a.getValueAt(j) <= b.getValueAt(k)) { //Compare and insert lowest to a new arr
                newArray.setValueAt(i, a.getValueAt(j));
                j++;
            } else {
                newArray.setValueAt(i, b.getValueAt(k));
                k++;
            }
            newArray.nElems++;
            i++;
        }

        while (j < a.size()) {
            newArray.setValueAt(i, a.getValueAt(j));
            newArray.nElems++;
            i++;
            j++;
        }

        while (k < b.size()) {
            newArray.setValueAt(i, b.getValueAt(k));
            newArray.nElems++;
            i++;
            k++;
        }

        return newArray;
    }

    private void setValueAt(int index, long value) {
        a[index] = (int) value;
    }

    private int getValueAt(int index) {
        return a[index];
    }

    public static OrdArray mergeTwo(OrdArray a, OrdArray b) {
        int newLength = a.nElems + b.nElems;
        OrdArray newArray = new OrdArray(a.size() + b.size());


        return a;
    }


}
