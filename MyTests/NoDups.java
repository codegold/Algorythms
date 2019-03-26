package MyTests;

import java.util.Arrays;

public class NoDups {
    private int[] a;
    private int nElems;

    public NoDups(int max) {
        a = new int[max];
        nElems = 0;
    }

    public void noDuplicates() {

        int i, j;
        //int nElems = 6;
        for (i = 0; i < nElems; i++) {
            j = i + 1;
            while (j < nElems) {
                if (a[i] == a[j]) {
                    for (int k = j; k < nElems; k++)
                        if (k == nElems - 1) a[k] = 0;
                        else a[k] = a[k + 1];
                    nElems--;
                } else j++;

            }
        }
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public void insert(int value) {
        a[nElems] = value;
        nElems++;
    }
}

class NoDupsApp {
    public static void main(String[] args) {
        int maxSize = 6;
        //int[] arr = {11, 20, 6, 6, 6, 8};
        NoDups arr = new NoDups(maxSize);
        arr.insert(11);
        arr.insert(20);
        arr.insert(6);
        arr.insert(6);
        arr.insert(6);
        arr.insert(8);

        arr.display();
        arr.noDuplicates();
        System.out.println();
        arr.display();

    }
}
