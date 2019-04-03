package Lafore;

import MyTests.MyBubbleSort;

/**
 Bubble sort realizing.
*/


class ArrayBub {
    private int[] a;                                         // Link to array
    private int nElems;                                //Quantity of elements

//---------------------------------------------------------------------------

    public ArrayBub(int max) {                                  //Constructor
        a = new int[max];
        nElems = 0;                                           //Now no arrays
    }
//---------------------------------------------------------------------------

    public void insert(int value) {
        a[nElems] = value;                                       // Inserting
        nElems++;                                                    //Size +
    }

    //-----------------------------------------------------------------------
    public void display() {
        for (int i = 0; i < nElems; i++)                          // For each
            System.out.print(a[i] + " ");
        System.out.println();
    }

//---------------------------------------------------------------------------
    public void bubbleSort() {
        int in, out;
        for (out = nElems - 1; out > 0; out--)             //Outer cycle back
            for (in = 0; in < out; in++)               //Inner cycle straight
                if (a[in] > a[in + 1])                        //Order broken?
                    swap(in, in + 1);                    //Change places
    }
//---------------------------------------------------------------------------

    private void swap(int one, int two) {
        int temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}

/////////////////////////////////////////////////////////////////////////////
class BubbleSortApp {
    public static void main(String[] args) {

        ArrayBub arr = new ArrayBub(100);       //Create array with size

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();

        arr.bubbleSort();
        arr.display();

        ArrayBub arr2 = new ArrayBub(5);
        arr2.insert(77);
        arr2.insert(90);
        arr2.insert(33);
        arr2.insert(44);
        arr2.insert(10);
        //arr2.insert(10);
        System.out.println();
        arr2.display();
        arr2.bubbleSort();
        System.out.println();
        arr2.display();
    }




}
/////////////////////////////////////////////////////////////////////////////


