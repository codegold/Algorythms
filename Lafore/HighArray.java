package Lafore;

public class HighArray {
    private int[] a;               // hyper on array a
    private int nElems;            // quantity of elements in array

    public HighArray(int max) {     // constructor
        a = new int[max];           // creation of array
        nElems = 0;                 // no elements now
    }

    public boolean find(int searchKey) {
        int j;
        for (j = 0; j < nElems; j++)            // for each element
            if (searchKey == a[j])              // founded?
                break;                          // yes? exit
        if (j == nElems)
            return false;                   // yes
        else
            return true;                    // no

    }

    public void insert(int value) {        //insert element in array
        a[nElems] = value;                 //inserting
        nElems++;                          //sizing++
    }

    public boolean delete(int value) {
        int j;
        for (j = 0; j < nElems; j++)       //searching value
            if (value == a[j])
                break;
        if (value == nElems)
            return false;                       // unsuccessful search
        else {                                  // founded
            for (int k = j; k < nElems; k++)    //move next elements
                a[k] = a[k + 1];
            nElems--;                           // sizing--
            return true;
        }
    }

    public void display() {                     //display array content
        for (int j = 0; j < nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println();
    }
}